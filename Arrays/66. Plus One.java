class Solution {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] result1 = plusOne(digits1);
        for (int d : result1) System.out.print(d + " "); // 1 2 4
        System.out.println();

        int[] digits2 = {9, 9, 9};
        int[] result2 = plusOne(digits2);
        for (int d : result2) System.out.print(d + " "); // 1 0 0 0
    }
}
