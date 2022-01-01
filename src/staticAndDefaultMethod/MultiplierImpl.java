package staticAndDefaultMethod;

import java.util.List;

public class MultiplierImpl implements Multiply {

	@Override
	public int multiply(List<Integer> integers) {
		return integers.stream().reduce(1,(x,y)->x*y);
 	}
	public int size(List<Integer> integers) {
		System.out.println("Inside impl");
		return integers.size();
	}
}
