package offer.offer0027;

/**
 * @author wangjinxin
 * @date 2023/12/14 19:43
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {

    ListNode left;

    public boolean isPalindrome(ListNode head) {
        left = head;

        return judge(head);
    }

    public boolean judge(ListNode right){
        if(right == null){
            return true;
        }

        boolean result = judge(right.next);
        result = result && (left.val == right.val);
        left = left.next;
        return result;
    }
}
