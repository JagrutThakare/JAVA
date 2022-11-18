package conditionalStatement;
import java.util.Scanner;
public class Calci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First No.");
		int a = sc.nextInt();
		System.out.println("Enter Second No.");
		int b = sc.nextInt();
		System.out.println("Enter Operation");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		int result = 0;
		
		switch(operation) {
		case '+' :
			result = a + b;
			break;
		case '-' :
			result = a -b;
			break;
		case '*' :
			result = a * b;
			break;
		case '/' :
			 result = a/b;
			 break;
		default :
			System.out.println("Invalid Operation");
			
		}
		System.out.println("the result is \n" + result);
sc.close();
	}

}
