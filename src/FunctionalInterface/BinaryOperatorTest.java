package FunctionalInterface;

import java.util.function.BinaryOperator;

/*The BinaryOperator interface represents an operation upon two operands of the same type, producing a result of the same type as the operands
*/
public class BinaryOperatorTest {

	public static void main(String[] args) {
 
		BinaryOperator<String> operator=(a,b)->a+" "+b;
		System.out.println("After concat -"+operator.apply("Arpita", "Amlan"));
		
	}

}
