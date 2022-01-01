package staticAndDefaultMethod;

import java.util.Arrays;

public class MultiplierClient {

	public static void main(String[] args) {
		Multiply multiply = new MultiplierImpl();
		int r=multiply.multiply(Arrays.asList(1,2,3,5));
		
		System.out.println("Result is "+r);
		System.out.println("Default method size is "+multiply.size(Arrays.asList(1,2,3,5)));
		
		System.out.println("Static method is empty "+Multiply.isEmpty(Arrays.asList(1,2,3,5)));
		
	}

}
