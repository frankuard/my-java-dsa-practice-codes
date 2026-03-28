package javaDSA;

// SOLID RHOMBUS
public class number11 {

	public static void main(String[] args) {
		
		int n= 5;
		// OUTER LOOP
		for(int i=1; i<=n; i++) {
			// SPACES
			int spaces = n-i;
			// INNER LOOP OF SPACES
			for (int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			// INNER LOOP FOR STARS (5 CAUSE EVERYTIME WE NEED TO PRINT 5)
			for (int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
