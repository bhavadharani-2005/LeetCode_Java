class Solution {
    public int findMin(int[] r) {
        int n = r.length - 1;
        int last = r[n];
        int left = 0,right =n;

        while(left < right){
            int mid = (left + right) >> 1;
            if (r[mid] > last) left = mid +1;
            else right = mid;
        }
        return r[left];
    }
}
