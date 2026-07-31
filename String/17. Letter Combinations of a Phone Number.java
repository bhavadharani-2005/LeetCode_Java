import java.util.*;

public class Solution {

    // Mapping digits to corresponding letters
    private static final String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;
        backtrack(result, new StringBuilder(), digits, 0);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder sb, String digits, int index) {
        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = KEYPAD[digit];
        for (char c : letters.toCharArray()) {
            sb.append(c);
            backtrack(result, sb, digits, index + 1);
            sb.deleteCharAt(sb.length() - 1); // backtrack
        }
    }

    // Example usage
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.letterCombinations("23"));
    }
}
