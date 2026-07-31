class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[]frq=new int[nums.length+1];// O(n) space
        ArrayList<Integer> list=new ArrayList<>(); //O(k) space , k is elements added
        for(int i=0; i<nums.length; i++){
            int t=nums[i];// O(1) space
            frq[t]++;
        }
        for(int i=1; i<=nums.length; i++){
            if(frq[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}
