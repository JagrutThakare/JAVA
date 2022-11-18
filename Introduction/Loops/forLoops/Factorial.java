package Loops.forLoops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = 1;
		System.out.println("Plz enter the value of n");
		int n = sc.nextInt();
		
		
		for(int i = 1; i<=n ; i++) {
			
			x *= i;
			
		}
		System.out.println("The valu of n! is \n" + x);
sc.close();
	}

}
