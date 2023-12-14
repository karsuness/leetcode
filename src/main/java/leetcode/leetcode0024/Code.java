package leetcode.leetcode0024;

/**
 * @author wangjinxin
 * @date 2023/12/14 20:55
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode a, b;
        a = head;
        b = head.next;

        ListNode node = swapPairs(b.next);

        b.next = a;
        a.next = node;

        return b;
    }
}
