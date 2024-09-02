
import java.util.Scanner;

public class patten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		star(row);
		star1(row);
		sc.close();

	}
	public static void star(int row) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
			System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	
	public static void star1(int row) {
		 if (row <= 0) {
	            return; // Base case to stop recursion
	        }
		for(int i=row;i>0;i--) {
			System.out.print("* ");
			
		}
		System.out.println();
		star1(row-1);
	}
	
	

}