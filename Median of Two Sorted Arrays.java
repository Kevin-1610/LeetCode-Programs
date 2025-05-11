import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int n1 = nums2.length;
        int[] ans = new int[n + n1];

        System.arraycopy(nums1, 0, ans, 0, n);
        System.arraycopy(nums2, 0, ans, n, n1);

        Arrays.sort(ans);

        int len = ans.length;
        if (len % 2 == 1) {
            return ans[len / 2];
        } else {
            return (ans[len / 2] + ans[(len / 2) - 1]) / 2.0;
        }
    }
}
