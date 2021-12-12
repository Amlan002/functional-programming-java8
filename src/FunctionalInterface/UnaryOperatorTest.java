package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/*UnaryOperator<T> is a functional interface that extends the Function interface. 
It represents an operation that accepts a parameter and returns a result of the same type as its input parameter.*/

public class UnaryOperatorTest {

	public static void main(String[] args) {
		
		List<Integer> intList = List.of(1, 4, 6, 7, 8);
		UnaryOperator<Integer> operator=i->i*100;
		System.out.println("Multiply by 100 "+multiply(intList,operator));
 
	}

	private static <T> List<T> multiply(List<T> intList, UnaryOperator<T> operator) {
		
		List<T> list=new ArrayList<>();
		for (T t : intList) {
			T ele=operator.apply(t);
			list.add(ele);
		}
		
 		return list;
	}

}
