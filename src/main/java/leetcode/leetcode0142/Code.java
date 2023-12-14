package leetcode.leetcode0142;

/**
 * @author wangjinxin
 * @date 2023/12/11 12:21
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public ListNode detectCycle(ListNode head) {
        ListNode fast, snow;
        fast = snow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            snow = snow.next;

            if (fast == snow) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        snow = head;

        while (snow != fast) {
            snow = snow.next;
            fast = fast.next;
        }

        return snow;
    }
}
