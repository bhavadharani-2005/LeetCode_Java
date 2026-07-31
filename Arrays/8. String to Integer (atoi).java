public class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;
        
        int i = 0, n = s.length();
        // 1. Skip leading whitespace
        while (i < n && s.charAt(i) == ' ') i++;
        
        // 2. Check if empty string after trimming
        if (i == n) return 0;
        
        // 3. Determine the sign
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        
        // 4. Convert digits to number
        long result = 0; // Use long to handle overflow
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
            
            // 5. Clamp the value if out of 32-bit range
            if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            
            i++;
        }
        
        return (int) (sign * result);
    }
}
