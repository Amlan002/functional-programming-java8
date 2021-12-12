package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*
Function<T, R> is an in-built functional interface introduced in Java 8 in the java.util.function package. 
The primary purpose for which Function<T, R> has been created is for mapping scenarios i.e when an object 
of a type is taken as input and it is converted(or mapped) to another type. Common usage of Function is in 
streams where-in the map function of a stream accepts an instance of Function to convert the stream of one 
type to a stream of another type.
*/
public class FunctionTest {

	public static void main(String[] args) {
		
		List<String> list=List.of("kit","Kat","Shake");
		Function<String, Integer> function=e->e.length();
		List<Integer> newList=mapList(list,function);
		System.out.println("Length of string" +newList);
	}

	private static <T,R> List<R> mapList(List<T> list, Function<T, R> function) {
		List<R> newlst=new ArrayList<R>();
		for (T e : list) {
			newlst.add(function.apply(e));
		}
		
		
		return newlst;
	}

}
