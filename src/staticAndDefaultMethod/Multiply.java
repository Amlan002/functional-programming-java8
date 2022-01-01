package staticAndDefaultMethod;

import java.util.List;

public interface Multiply {

	int multiply(List<Integer> integers);
	
	default int size(List<Integer> integers) {
		System.out.println("inside interface");
		return integers.size();
	}
	
	static boolean isEmpty(List<Integer> integers) {
		return integers!=null && integers.size()>=0;
	}
}
