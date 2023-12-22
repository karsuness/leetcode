package leetcode.leetcode0543;

/**
 * @author wangjinxin
 * @date 2023/12/20 12:38
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    int result = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        this.traverse(root);
        return result;
    }

    public int traverse(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftLength = traverse(root.left);
        int rightLength = traverse(root.right);

        int temp = 0;

        if (leftLength != 0) {
            temp = temp + leftLength;
        }

        if (rightLength != 0) {
            temp = temp + rightLength;
        }

        result = Math.max(temp, result);

        return Math.max(leftLength, rightLength) + 1;
    }
}
