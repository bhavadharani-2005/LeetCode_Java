class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> main = new HashMap<>();
        for(char i : s.toCharArray()){
            main.put(i, main.getOrDefault(i,0)+1);
        }
        for(int i = 0;i < s.length();i++){
            if(main.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    // int[] freq=new int[26];
    // for(char c:s.toCharArray()){
    //     freq[c-'a']++;
    // }
    // for(int i=0;i<s.length();i++){
    //     if(freq[s.charAt(i)-'a']==1){
    //     return i;
    //     }
    // }
    // return -1;  
    }
}
