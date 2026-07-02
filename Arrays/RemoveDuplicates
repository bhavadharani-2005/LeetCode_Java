public class Solution {
    public int removeDuplicates(int[] nums) {

        // Set<Integer> set = new HashSet<>();

        // for(int i : nums)set.add(i);
        // System.out.print(set);


        if (nums.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 1, 2};
        int k = sol.removeDuplicates(nums);
        System.out.println(k); 
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
