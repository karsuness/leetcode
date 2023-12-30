package leetcode.leetcode0752;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author wangjinxin
 * @date 2023/12/22 15:07
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public int openLock(String[] deadends, String target) {

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        Set<String> deadendSet = new HashSet<>();
        for (int i = 0; i < deadends.length; i++) {
            deadendSet.add(deadends[i]);
        }

        queue.offer("0000");
        visited.add("0000");

        int nums = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String current = queue.poll();

                if (target.equals(current)) {
                    return nums;
                }

                if (deadendSet.contains(current)) {
                    continue;
                }

                if (visited.contains(current)) {
                    continue;
                }

                for (int j = 0; j < 4; j++) {
                    String plus = plus(current, j);
                    String minus = minus(current, j);

                    if (!visited.contains(plus)) {
                        queue.offer(plus);
                        visited.add(plus);
                    }

                    if (!visited.contains(minus)) {
                        queue.offer(minus);
                        visited.add(minus);
                    }
                }
            }
            nums++;
        }

        return -1;
    }


    public String plus(String str, int index) {
        char[] charArray = str.toCharArray();
        if (charArray[index] == '9') {
            charArray[index] = '0';
        } else {
            charArray[index] += 1;
        }
        return String.valueOf(charArray);
    }

    public String minus(String str, int index) {
        char[] charArray = str.toCharArray();
        if (charArray[index] == '0') {
            charArray[index] = '9';
        } else {
            charArray[index] -= 1;
        }
        return String.valueOf(charArray);
    }
}
