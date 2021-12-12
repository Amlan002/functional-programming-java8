package FunctionalInterface;

import java.util.function.Supplier;

/*Java 8 Supplier is a functional interface whose functional method is get(). 
The Supplier interface represents an operation that takes no argument and returns a result. 
As this is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference
*/
public class SuppilerTest {

	public static void main(String[] args) {
		
		Supplier<String> stringSupplier=()->new String("A String");
		System.out.println(stringSupplier.get());
		
		Supplier<Double> randomNumber=()->Math.random();
		System.out.println("random no "+randomNumber.get());
	}

}
