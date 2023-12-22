package leetcode.leetcode0111;

/**
 * @author wangjinxin
 * @date 2023/12/19 21:40
 * @mail karsuness@gmail.com
 * @description
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
