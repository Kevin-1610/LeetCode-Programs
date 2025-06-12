class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDiff = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int diff = Math.abs(nums[i] - nums[(i + 1) % n]);
            maxDiff = Math.max(maxDiff, diff);
        }
        return maxDiff;
    }
}
