// Problem statement
// Write a program to input an integer 'n' and print the sum of all its even digits and the sum of all its odd digits separately.


// Digits mean numbers, not places! That is, if the given integer is "132456", even digits are 2, 4, and 6, and odd digits are 1, 3, and 5.

// Constraints
// 0<= 'n' <=10000


// Example :
// Input: 'n' = 132456

// Output: 12 9

// Explanation:
// The sum of even digits = 2 + 4 + 6 = 12
// The sum of odd digits = 1 + 3 + 5 = 9

// Constraints
// 0<= 'n' <=10000


import java.util.*;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner (System.in);

		int n = s.nextInt();
		int evensum = 0, oddsum=0;
		while(n>0){
			int digit=n%10;
			if(digit%2==0){
				evensum=evensum+digit;
			}else{
				oddsum=oddsum+digit;
			}
			n=n/10;
		}
			System.out.print(evensum+" "+oddsum);


	}
}
