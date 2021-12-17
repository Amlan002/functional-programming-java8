package lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		Comparator<Integer> comparator=(a,b)->{
			return a.compareTo(b);
		};
		
		Comparator<Integer> comparator2=(a,b)-> a.compareTo(b);
		
		System.out.println("Result 1 "+comparator.compare(10, 3));
		System.out.println("Result 1 "+comparator2.compare(10, 3));
	}

}
