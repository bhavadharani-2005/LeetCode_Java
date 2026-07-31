 class Solution {
     public boolean checkIfPangram(String s) {
        
        for(char i ='a'; i <= 'z'; i++){
            if(s.indexOf(i) == -1){
                return false;
            }
        }

            // __________________________________________________________

        // HashSet<Character> set = new HashSet<>();

        // for (char ch : s.toCharArray()) {
        //     set.add(ch);
        // }

        // return set.size() == 26;

            // _______________________________________________________________________

    // for (char c = 'a'; c<='z';c++){
    //         if(s.indexOf(c)==-1){
    //             return false;
    //         }
    //     }
    return true;

    }
}
