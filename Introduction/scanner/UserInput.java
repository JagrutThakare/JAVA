package scanner;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		// 
		
		Scanner sc = new Scanner(System.in);
		
	//	int x = sc.nextInt();
		
		String hello = sc.nextLine();
		
		System.out.println(hello);
		
		sc.close();
	}

}
