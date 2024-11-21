class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Iterate through all pairs
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the pair sums up to the target
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // If no solution is found
        throw new IllegalArgumentException("No two sum solution");
    }
}