class Solution {
    public char findTheDifference(String s, String t) {

        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        for(int i = 0; i < a1.length;i++){
            if(a1[i] != a2[i]){
                return a2[i];
            }
        }
        return a2[a2.length-1];
        // String ans="";
        // for(int i=0;i<s.length();i++){
        //     for(int j=0;j<t.length();j++){
        //         if(!(s.contains(t))){
        //             // ans=t.charAt();
        //             return t(j);
        //         }
        //     }
        // }
    }
}
