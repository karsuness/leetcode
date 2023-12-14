package leetcode.leetcode0019;

/**
 * @author wangjinxin
 * @date 2023/12/10 21:48
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //使用虚拟节点防止空指针
        ListNode result = new ListNode();
        result.next = head;

        //这里传入n+1，找到前一个节点
        ListNode node = this.getNode(result, n + 1);

        node.next = node.next.next;

        return result.next;
    }

    public ListNode getNode(ListNode head, int n) {
        ListNode p1 = head, p2 = head;
        for (int i = 0; i < n; i++) {
            p1 = p1.next;
        }

        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }
}
