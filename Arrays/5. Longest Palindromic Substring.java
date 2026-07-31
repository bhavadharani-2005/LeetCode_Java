 class Solution {
    int st =0, end = 0;
    int n;

    public String longestPalindrome(String s) {
        n = s.length();
        getString(s.toCharArray(), 0);
        return s.substring(st, end+1);
    }

    private void getString(char[] arr, int i){
        if(i >= n) return;

        int left = i;
        int right = i;

        while(right + 1 < n && arr[right + 1] == arr[i]){
            right++;
        }

        i = right + 1;

        while( left-1 >= 0 && right+1 < n && arr[left-1] == arr[right+1]){
            left--;
            right++;
        }

        if(right - left > end - st){
            st = left;
            end = right;
        }

        getString(arr, i);
    }
}
