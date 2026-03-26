package javaDSA;

// PRINTING INVERTED HALF PYRAMID (rotated by 180 degree)
public class number5 {

	public static void main(String[] args) {
		
		int n = 4;
		
		for (int i=1; i<=n; i++) {
			// FOR SPACE PRINT
			for (int j=1;j<=n-i;j++) {
					System.out.print(" ");
			}
			
			//FOR STAR PRINT
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
