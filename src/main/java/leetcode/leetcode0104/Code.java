package leetcode.leetcode0104;

/**
 * @author wangjinxin
 * @date 2023/12/19 21:40
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {

    int result = 0;
    int deep = 0;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return result;
        }

        traverse(root);
        return result;
    }

    public void traverse(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        deep++;
        result = Math.max(deep, result);
        traverse(treeNode.left);
        traverse(treeNode.right);
        deep--;
    }
}
