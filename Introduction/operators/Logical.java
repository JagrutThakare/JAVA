package operators;

public class Logical {
	public static void main(String[] args) {
		
		boolean Jagrut = true;
		boolean Om = false;
		
		boolean c = !(Jagrut||Om);
		System.out.println(c);
		
		int number = 99;
		if(number >= 1 && number <= 100) {
			// we can also use '&' one time in above.
//			(single) & = bitwise AND checks both condition and && = logical Operator.
			System.out.println("Number is in the range.");
		
		boolean a = true;
		boolean b = false;
		
		System.out.println("a && b = " + (a&&b));
		
		System.out.println("a || b = " + (a||b));
		
		System.out.println("!(a&&b) =" + !(a&&b));
		}
	}
}
