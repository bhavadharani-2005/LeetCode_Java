class Solution {
    public int compress(char[] c) {
        int  i =0;
        int k = 0;
        while( i < c.length){
            char cr = c[i];
            int count = 0;
            while(i < c.length && c[i] == cr){
                i++;
                count++;
            }
            c[k++] = cr;
            if(count > 1){
                for(char ct : String.valueOf(count).toCharArray()){
                    c[k++] = ct;
                }
            }
        }
            return k;
    }
}
