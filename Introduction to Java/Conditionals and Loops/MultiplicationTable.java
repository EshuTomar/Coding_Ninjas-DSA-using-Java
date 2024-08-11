// Problem statement

// Write a program that generates a multiplication table for a given integer.


import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in); 

        int n = s.nextInt();
        int i = 1;
        for(i = 1;i<11;i++) {
            System.out.println(n*i);
        }
	
	}
}
