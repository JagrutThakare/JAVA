package Loops.forLoops;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean isPrime = true;
 		
		int n = sc.nextInt();
		for(int i = 2; i*i < n; i++) {
			if(n%i == 0) {
				isPrime = false;
				break;
				
			} 
		}
		if(n<2) isPrime = false;
		System.out.println("Is Prime " + isPrime);
sc.close();
	}

}
