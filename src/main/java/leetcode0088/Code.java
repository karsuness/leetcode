package leetcode0088;

/**
 * @author wangjinxin
 * @date 2023/12/10 12:47
 * @mail wangjinxin03@corp.netease.com
 * @description
 */
public class Code {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = nums1.length - 1;
        int m1 = m - 1;
        int n1 = n - 1;

        while (m1 >= 0 && n1 >= 0) {
            if (nums1[m1] > nums2[n1]) {
                nums1[p--] = nums1[m1--];
            } else {
                nums1[p--] = nums2[n1--];
            }
        }

        while (n1 >= 0) {
            nums1[p--] = nums2[n1--];
        }
    }
}
