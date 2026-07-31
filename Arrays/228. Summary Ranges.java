class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> sum = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int start = nums[i];
            while(i + 1 <nums.length && nums[i]+1 == nums[i+1]){
                i++;
            }
                if(start==nums[i]){
                    sum.add(""+start);
                }
                else{
                    sum.add(start+"->"+nums[i]);
                }i++;
            }
        return sum;
    }
}
