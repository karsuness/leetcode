package leetcode0141;

/**
 * @author wangjinxin
 * @date 2023/12/11 12:51
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public boolean hasCycle(ListNode head) {
        ListNode fast, snow;
        fast = snow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            snow = snow.next;

            if (snow == fast) {
                break;
            }
        }

        return ! (fast == null || fast.next == null);
    }
}
