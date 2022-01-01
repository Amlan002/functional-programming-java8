package staticAndDefaultMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Amlan", "Tapa", "Arpita", "Mahapatra", "Khusi", "Dev", "Adam", "Eve");
		// in alphabetical order

		// before java 8
		Collections.sort(strings);
		System.out.println("Sorted list using collections.sort() " + strings);
		
		//java 8
		strings.sort(Comparator.naturalOrder());
		System.out.println("Sorted list using Comparator.naturalOrder() " + strings);
		
		strings.sort(Comparator.reverseOrder());
		System.out.println("Sorted list using Comparator.reverseOrder() " + strings);

	}

}
