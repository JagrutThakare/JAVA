package conditionalStatement;

public class switchCase {

	public static void main(String[] args) {
		// 

		int dayOfWeek = 1;
		 
		switch (dayOfWeek) {
		case 1:
		System.out.println("I'm on leave");
		break;
		case 2:
			System.out.println("I'm in office");
			break;
		case 3 :
			System.out.println("Playing");
			break;
		default :
			System.out.println("I Dont know what day it is");
		}
	}

}
