package leetcode.leetcode0876;

/**
 * @author wangjinxin
 * @date 2023/12/11 11:10
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head, snow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            snow = snow.next;
        }

        return snow;
    }
}
