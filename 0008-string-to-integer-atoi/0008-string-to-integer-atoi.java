// class Solution {
//     public int myAtoi(String s) {
//         int sign = 1;
//         int res = 0;
//         int i = 0;
//         //step 1
//         while(i<s.length() && s.charAt(i)== ' '){
//             i++;
//         }

//         //step 2
//         if(i<s.length() && (s.charAt(i)== '+' || s.charAt(i)== '-')){
//             if(s.charAt(i)== '-'){
//                 sign = -1;
//             }
//             i++;
//         }

//         //step 3 
//         while(i < s.length() &&s.charAt(i)< '9'&& s.charAt(i)> '0' ){
//             res = res*10 + (s.charAt(i)-'0');

//             if(res*sign  > Integer.MAX_VALUE){
//                 return Integer.MAX_VALUE*sign;
//             }
//             if(res*sign  < Integer.MIN_VALUE){
//                 return Integer.MIN_VALUE;
//             }
//             i++;
//         }
//         return res*sign;
//     }
// }
class Solution {
    public int myAtoi(String s) {
        int index = 0, sign = 1, total = 0;
        int n = s.length();

        // Step 1: Remove leading whitespaces
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        // Step 2: Handle signs
        if (index < n && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        // Step 3: Convert digits and avoid overflow
        while (index < n) {
            char c = s.charAt(index);
            if (c < '0' || c > '9') {
                break;
            }

            int digit = c - '0';

            // Check for overflow/underflow
            if (total > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = total * 10 + digit;
            index++;
        }

        return total * sign;
    }

}