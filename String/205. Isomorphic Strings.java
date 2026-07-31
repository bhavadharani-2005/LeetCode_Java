class Solution {
     public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> charIndexS = new HashMap<>();
        HashMap<Character, Integer> charIndexT = new HashMap<>();

//         for (int i = 0; i < s.length(); i++) {
//             if (!charIndexS.containsKey(s.charAt(i))) {
//                 charIndexS.put(s.charAt(i), i);
//             }

//             if (!charIndexT.containsKey(t.charAt(i))) {
//                 charIndexT.put(t.charAt(i), i);
//             }

//             if (!charIndexS.get(s.charAt(i)).equals(charIndexT.get(t.charAt(i)))) {
//                 return false;
//             }
//         }

//         return true;      

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map1.containsKey(ch1)) {
                if (map1.get(ch1) != ch2) {
                    return false;
                }
            } else {
                map1.put(ch1, ch2);
            }

            if (map2.containsKey(ch2)) {
                if (map2.get(ch2) != ch1) {
                    return false;
                }
            } else {
                map2.put(ch2, ch1);
            }
        }

        return true;  
    }
}
