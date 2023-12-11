package leetcode0206;

/**
 * @author wangjinxin
 * @date 2023/12/11 14:11
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public ListNode reverseList(ListNode head) {
        ListNode p1, p2, tail;
        p1 = p2 = head;
        tail = null;

        while (p1 != null) {
            p2 = p1;
            p1 = p1.next;
            p2.next = tail;
            tail = p2;
        }
        return p2;
    }
}
