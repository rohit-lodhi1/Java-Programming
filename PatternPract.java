

public class PatternPract {

	public static void main(String[] args) {
		star(5);

	}

	// <-----Star----->
	public static void star(int size) {
		int n=size;
		for(int i=0;i<n;i++) {
			
			for(int k=i;k<n-1;k++)
				System.out.print(" ");
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
