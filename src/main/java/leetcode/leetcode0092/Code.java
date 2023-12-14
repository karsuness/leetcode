package leetcode.leetcode0092;

/**
 * @author wangjinxin
 * @date 2023/12/13 12:07
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    ListNode next = null;
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == 1) {
            return reverse(head, right);
        }

        head.next = reverseBetween(head.next, left - 1, right - 1);
        return head;
    }

    public ListNode reverse(ListNode node, int n) {
        if (n == 1) {
            next = node.next;
            return node;
        }

        ListNode result = reverse(node.next, n - 1);
        node.next.next = node;
        node.next = next;
        return result;
    }
}
