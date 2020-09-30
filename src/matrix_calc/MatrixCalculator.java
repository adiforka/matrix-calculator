package practise;
import java.util.Scanner;
public class Practise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Dimensions of first matrix");
		int rows1 = sc.nextInt();
		int cols1 = sc.nextInt();
		System.out.println("Enter the Dimensions of second matrix");
		int rows2 = sc.nextInt();
		int cols2 = sc.nextInt();
		if(cols1==rows2) {
		int m1[][] = new int[rows1][cols1];
		int m2[][] = new int[rows2][cols2];
		System.out.println("Enter The First Matrix:");
		for(int i =0;i<rows1;i++) {
			for(int j=0;j<cols1;j++) {
			m1[i][j] = sc.nextInt();
		}
		}
		System.out.println("Enter the second Matrix:");
		for(int i =0;i<rows2;i++) {
			for(int j=0;j<cols2;j++) {
			m2[i][j] = sc.nextInt();
		}
		}
			
			
		int r[][] = new int[rows1][cols2];
	
		
			
			for(int i = 0;i<rows1;i++) {
				for(int j =0;j<cols2;j++) {
					for(int k =0;k<cols1;k++) {
						
						r[i][j] +=  m1[i][k] * m2[k][i];
						
					}
					
				}
				
				
			}
			System.out.println("The Result is :");
			for(int i = 0;i<rows1;i++) {
				for(int j=0;j<cols2;j++) {
				System.out.print(r[i][j]+" ");
			}
				System.out.println();
				}	
			
		}
		
		
		
		else {
			
		System.out.println("These Two Matrices Cannot Be Multiplied!");
		}
		
	}
}
