class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int totalTriangles = 0;

        for (int longest = nums.length - 1; longest >= 2; longest--) {
            int left = 0;
            int right = longest - 1;

            while (left < right) {
                if (nums[left] + nums[right] > nums[longest]) {
                    totalTriangles += (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }
        return totalTriangles;
    }
}
