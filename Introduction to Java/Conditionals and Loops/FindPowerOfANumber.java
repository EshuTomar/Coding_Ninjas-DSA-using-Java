// Problem statement


// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.

// Note : For this question, you can assume that 0 raised to the power of 0 is 1



// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 0 <= x <= 8 
// 0 <= n <= 9
// Sample Input 1 :
//  3 4
// Sample Output 1 :
// 81




import java.util.*;
public class FindPowerOfANumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int n = s.nextInt();

        if (x == 0 && n == 0) {
            System.out.println("1");
        } else {
            int result = 1;

            for (int i = 0; i < n; i++) {
                result =result*x;
            }

            System.out.println(result);
        // Write your code here
        
    }
    }
}
