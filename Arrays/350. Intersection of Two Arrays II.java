class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);

        // ArrayList<Integer> arr = new ArrayList<Integer>();

        // int i = 0, j = 0;
        // while(i < nums1.length && j < nums2.length){
        //     if(nums1[i] < nums2[j]){
        //         i++;
        //     }
        //     else if(nums1[i] > nums2[j]){
        //         j++;
        //     }
        //     else{
        //         arr.add(nums1[i]);
        //         i++;
        //         j++;
        //     }
        // }
        // int [] op = new int [arr.size()];
        // int k = 0;
        // while(k < arr.size()){
        //     op[k] = arr.get(k);
        //     k++;
        // }
        // return op;



        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n:nums1)
            map.put(n,map.getOrDefault(n,0)+1);

        List<Integer> list = new ArrayList<>();

        for(int n:nums2){

            if(map.getOrDefault(n,0)>0){

                list.add(n);

                map.put(n,map.get(n)-1);
            }
        }

        int[] ans = new int[list.size()];

        for(int i=0;i<list.size();i++)
            ans[i]=list.get(i);

        return ans;


    }
}
