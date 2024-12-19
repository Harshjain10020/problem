class Solution {
    
    public String addBinary(String a, String b) {
        // Trim leading zeros from both strings
        a = trim(a);
        b = trim(b);

        int n = a.length();
        int m = b.length();

        // Ensure a is the longer string
        if (n < m) {
            return addBinary(b, a);
        }

        int j = m - 1, carry = 0;
        StringBuilder res = new StringBuilder();

        // Perform binary addition
        for (int i = n - 1; i >= 0; i--) {
            int bit1 = a.charAt(i) - '0'; // Convert '0' or '1' to integer
            int sum = bit1 + carry;

            if (j >= 0) {
                int bit2 = b.charAt(j) - '0'; // Convert '0' or '1' to integer
                sum += bit2;
                j--;
            }

            int bit = sum % 2; // Compute the result bit
            carry = sum / 2;   // Update carry

            res.append((char) (bit + '0')); // Convert bit to character and append
        }

        // If there's any carry left, append it
        if (carry > 0) {
            res.append('1');
        }

        // Reverse and return the result
        return res.reverse().toString();
    }

    // Helper method to trim leading zeros
    static String trim(String s) {
        int firstOne = s.indexOf('1');
        if (firstOne == -1) {
            return "0"; // If no '1' is found, return "0"
        }
        return s.substring(firstOne);
    }

}