package leetcode.leetcode0025;

/**
 * @author wangjinxin
 * @date 2023/12/14 17:58
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode start, end;
        start = end = head;

        for (int i = 0; i < k; i++) {
            if (end == null) {
                return start;
            }
            end = end.next;
        }

        ListNode node = reverse(start, end);

        start.next = reverseKGroup(end, k);

        return node;
    }

    public ListNode reverse(ListNode start, ListNode end) {
        ListNode pre = null;
        ListNode cur, next;
        cur = next = start;
        while (cur != end) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
