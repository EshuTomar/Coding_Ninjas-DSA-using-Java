
import java.util.Scanner;
public static void main(String[] args) {
		
    
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();

        
        while(s<=e){
            double c = (s-32)*(5.0/9.0);
            int C= (int)c;
            System.out.println(s+" " + C);          // s should be capital
            s=s+w;
            
        }

}