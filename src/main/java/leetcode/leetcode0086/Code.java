package leetcode.leetcode0086;

/**
 * @author wangjinxin
 * @date 2023/12/10 16:34
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public ListNode partition(ListNode head, int x) {
        ListNode result = new ListNode();
        ListNode mid = new ListNode();
        ListNode p = head, h = result, m = mid;

        while (p != null) {
            if (p.val < x) {
                h.next = p;
                h = h.next;

            } else {
                m.next = p;
                m = m.next;
            }
            p = p.next;
        }

        m.next = null;
        h.next = mid.next;
        return result.next;
    }
}
