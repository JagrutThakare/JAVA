package Loops.doWhile;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 1;
		
		do {
			n = sc.nextInt();
			
			System.out.println("n is " + n);
			
		} while (n!=0);
		
		
		
sc.close();
	}

}
