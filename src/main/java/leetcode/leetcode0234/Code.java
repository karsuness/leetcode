package leetcode.leetcode0234;

/**
 * @author wangjinxin
 * @date 2023/12/15 10:51
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    ListNode left;

    public boolean isPalindrome(ListNode head) {
        left = head;
        return judge(head);
    }

    public boolean judge(ListNode head) {
        if (head == null) {
            return true;
        }

        boolean result = judge(head.next);

        result = result & (head.val == left.val);

        left = left.next;
        return result;
    }
}
