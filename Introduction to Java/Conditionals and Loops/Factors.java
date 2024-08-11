// Problem statement


// Write a program that takes a number as input and prints all its factors except 1 and the number itself.. If the number has only two factors (1 and the number itself), then the program should print -1.

// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 0 <= n <= 10,000
// Sample Input 1 :
// 8
// Sample Output 1 :
// 2 4
// Explanation of Sample Output 1 :
// The factors for the number excluding 1 and itself are 2 and 4, so the output is 2 4.



import java.util.*;
public class Factors {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n=s.nextInt();


	    int i = 1;
        int count = 0;
	    for(i=2;i<n ;i++) {
            if(n%i==0){
                System.out.print(i+" ");
                count++;
            }
	    }

        if(count == 0){
            System.out.print(-1);
        }

    }
}
