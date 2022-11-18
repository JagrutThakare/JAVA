package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		// 
 
		int a = 1782, b =8099 , c = 1000;
		int result = 0;
		
//		if (a>b) {
//			if (a>c) {
//				result =a ;
//				
//			} else {
//				result = c;
//				
//			}
//		} else {
//			if(b>c) {
//				result =b;
//				
//			}else {
//				result = c;
//				
//			}
//		}
//		System.out.println("Largest is = " + result);

		// Ternary WAY
		result = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
	
		System.out.println("Largest is = " + result);

	}

}
