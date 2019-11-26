package ByGoogle;

public class triangle {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("++++++++++++++++++++++++++");
		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
		System.out.println("++++++++++++++++++++++++++++++++++++");
		for(int i=1;i<=5;i++ ) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+j);
				
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++++++++++++++++");
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print(" "+j);
				
			}
			System.out.println();
			
		}
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++");
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print(""+j);
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		int n=5;
		for (int i=1; i<=n; i++) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for (int j=n-i; j>0; j--) 
            { 
                // printing spaces 
                System.out.print("*"); 
            } 
   
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for (int j=1; j<=i; j++ ) 
            { 
                // printing stars 
                System.out.print(" "+j); 
            } 
   
            // ending line after each row 
            System.out.println(); 
        } 
		
		for (int i=1;i<=5;i++) {
			for(int j=5-i;j>0;j--) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" "+j);
				
			}
			System.out.println();
			
		}
		
		

	}
}
