package javaDSA;
import java.util.Scanner;


public class timecomplexity {

	public static void main(String[] args) {
		
		// BOTH THE LOOPS EXECUTES DIFFERENTLY 
		// BASED ON THE VARIABLE ASSIGNED TO THEM
		// THE WORSE THE CASE TIME THE BETTER IT IS
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		for (int i=0; i<n;i++) {
			
			System.out.println("hello");
		}
		
		for (int j=0; j<m;j++) {
			
			System.out.println("hello");
		}
		
		scanner.close();
}
}
