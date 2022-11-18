package Loops.forLoops;

import java.util.Scanner;

public class breakClass {

	public static void main(String[] args) {

//		for(int i =1; i <= 100 ; i++) {
//			if(i == 35) {
//				break;
//			}
//			System.out.println(i);
//		}
	
		Scanner sc = new Scanner(System.in);
		
//		for(;;) {
//			int n = sc.nextInt();
//			if(n <0) {
//				break;
//				
//			}

		for(int i = 1; i<=100; i++) {
			
			if(i>=40 && i <= 50) {
				continue;
			}
			
			System.out.println(i);
			sc.close();
		}
	
	}

}
