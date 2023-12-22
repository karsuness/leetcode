package leetcode.leetcode0124;

/**
 * @author wangjinxin
 * @date 2023/12/20 13:39
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    int result = 0;

    public int maxPathSum(TreeNode root) {
        traverse(root);
        return result;
    }

    public int traverse(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = traverse(node.left);
        int right = traverse(node.right);

        int temp = node.val;

        if (left > 0) {
            temp += left;
        }

        if (right > 0) {
            temp += right;
        }

        result = Math.max(temp, result);
        return Math.max(Math.max(node.val, node.val + left), node.val + right);
    }
}
