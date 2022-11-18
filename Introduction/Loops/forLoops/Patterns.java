package Loops.forLoops;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
//Q1
		for(int j = 1; j<=n; j++) {
			
		
			for(int i = 1; i<=n; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	
// Q2 
		for(int i =1;i<=n; i++) {
			
			for(int j =1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

// Q3
		for(int i = 1; i<=n ; i++) {
			for(int j = 1; j<=i-1; j++) {
				System.out.print("  ");
			}
			for(int j =1; j<=n-i+1;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		System.out.println();

//Q4
		for(int i = n; i>=1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

//Q5
		for(int i = 1; i<=n; i++) {
			for(int j = 1 ; j<=n-i+1; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j<= i; j++) {
				System.out.print("* ");
			}
			System.out.println();			
		}
		System.out.println();
		
//Q6
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<= n-i+1; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j<= i; j++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
		System.out.println();

//Q7
		int a = 1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<= n-i+1; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j<= i; j++) {
				System.out.print(a++ +"   ");
			}
			System.out.println();
		}
		System.out.println();
	
// Q8
		int rows = 2*n -1;
		
		for(int i = 1; i<=rows; i++) {
			
				if(i <= n) {
					for(int j = 1; j<=i; j++) {
						System.out.print("* ");
				
					}
					
				} else {
					for(int j =1; j<= rows -i+1; j++) {
						System.out.print("* ");
					}
				}
		System.out.println();
		}
		System.out.println();
// Q9
		System.out.println("*");
		for(int i = 2; i<= n-1; i++) {
			System.out.print("* ");
			for(int j = 1; j<=i-2 ; j++) {
				System.out.print("  ");
			}
			System.out.println("*");
		}
		if(n>1) {
			for(int i = 1; i<=n; i++) {
			System.out.print("* ");
			}
		}
		System.out.println();

//10
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<= (n-i); j++) {
				System.out.print("  ");
			}
			for(int j = 1; j<= i;j++) {
				System.out.print("* ");
			}
		System.out.println();
			
		}
		for(int i=1; i< n; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j<=n-i; j++) {
				System.out.print("* ");
			}
		System.out.println();
		}

//11
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			for(int j =1 ; j<=2*i-1 ; j++) {
				System.out.print("  ");
			}
			for(int j =1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = n; i>=1; i--) {
			for(int j = 1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			for(int j =1 ; j<=2*i-1 ; j++) {
				System.out.print("  ");
			}
			for(int j =1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

//12
		
		for(int i =1; i<=n; i++) {
			
			for(int j = 1; j<=n-i; j++) {
				System.out.print("  ");
			}
			int x = 1;
				
			for(int j = 1; j<=2*i-1; j++) {
				System.out.print(x + " ");
				x +=1;
			}
			System.out.println();
		}

// 13
		int x = 1;
		for(int i =1; i<=n; i++) {
			
			for(int j = 1; j<=n-i; j++) {
				System.out.print("  ");
			}
			
				
			for(int j = 1; j<=2*i-1; j++) {
				if(j == 1 || j == 2*i-1) {
					System.out.print(x + " ");
				} else {
					System.out.print("0 ");
				}
				
			}
			x += 1;
			
			System.out.println();
		}

// 14		
		int y = 10;
		for(int i =1; i<=n; i++) {
			
			for(int j = 1; j<=n-i; j++) {
				System.out.print("  ");
			}
			
				
			for(int j = 1; j<=2*i-1; j++) {
				if(i == 1) {
					System.out.print("0 ");
				} else {
						if(j == 1 || j == 2*i-1) {
							System.out.print(y + " ");
							} else {
								System.out.print("0 ");
							}
				}
			}
			y -= 1;
			
			System.out.println();
		}

//15	
		for(int j = 1; j<=n-1; j++) {
			System.out.print("  ");
		}
		System.out.println("*");
		
		for(int i = 2; i<= n-1; i++) {
			for(int j = 1; j<n-i+1; j++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			for(int j = 1; j<=i-2 ; j++) {
				System.out.print("  ");
			}
			System.out.println("*");
		}
		if(n>1) {
			for(int i = 1; i<=n; i++) {
			System.out.print("* ");
			}
		}
		System.out.println();	

//16
		int num;
	      
	      System.out.print("Enter the Row Size of Pascal Triangle: ");
	      int row = sc.nextInt();
	      
	      for(int i=0; i<row; i++)
	      {
	         for(int space=row; space>i; space--) System.out.print(" ");
	         
	         num=1;
	         
	         for(int j=0; j<=i; j++)
	         {
	            System.out.print(num+ " ");
	            num = num*(i-j)/(j+1);
	         }
	         System.out.print("\n");
	      }
sc.close();	
	}

}
