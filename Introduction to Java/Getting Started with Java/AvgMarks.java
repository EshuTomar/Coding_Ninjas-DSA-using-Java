import java.util.Scanner;

public class AvgMarks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		 String name = s.next();
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();
        int average = (m1 + m2 + m3) / 3;

		System.out.println(name);
		System.out.println(average);
		
		// Close the scanner to avoid resource leaks
        s.close();

		
	}

}