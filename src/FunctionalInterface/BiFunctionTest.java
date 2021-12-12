package FunctionalInterface;

import java.util.function.BiFunction;

/*In Java 8, BiFunction interface is a built in functional interface which accepts two arguments and produces a results. 
This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference. 
Java BiFunction is common use case when we are working with Java HashMap.
*/
public class BiFunctionTest {

	public static void main(String[] args) {

		BiFunction<String, String, String> biFunction=(a,b)->(a+b);
		//BiFunction<String, String, Integer> biFunction=(a,b)->(a+b).length();
		System.out.println(biFunction.apply("Amlan", "Mahapatra"));
	}

}
