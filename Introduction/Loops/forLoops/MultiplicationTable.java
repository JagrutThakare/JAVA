package Loops.forLoops;

public class MultiplicationTable {

	public static void main(String[] args) {
		// 

		for(int j = 1; j<=10 ; j++) {
			
			for(int i =1; i<=20; i++) {
				System.out.print(i*j);
			
				if(i*j < 10) {
					System.out.print("   ");
				} else if (i*j < 100 && i*j >9) {
					System.out.print("  ");
				} else {
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
	}

}
