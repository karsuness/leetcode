package leetcode.leetcode0111;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wangjinxin
 * @date 2023/12/22 13:44
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int deep = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();

                if (treeNode.left == null && treeNode.right == null) {
                    return deep;
                }

                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }

                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            deep++;
        }
        return deep;
    }
}
