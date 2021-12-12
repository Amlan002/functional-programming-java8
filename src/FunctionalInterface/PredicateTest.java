package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
Predicates in Java 8 are used to separate out conditions or filters applied to collections of objects.Predicate is a Functional
interface and supports Lambda expressions.
*/
public class PredicateTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Basics");
		list.add("");
		list.add("java");
		list.add("");
		list.add("BasicsStrong");

		Predicate<String> predicate1 = s -> !s.isEmpty();
		List<String> newlist = filterList(list, predicate1);
		System.out.println("New non empty list " + newlist);

		Predicate<String> predicate2 = s -> s.contains("Basic");
		newlist = filterList(list, predicate2);
		System.out.println("New list contains basic " + newlist);

		System.out.println("============================================================");

		Predicate<String> predicate3 = s -> !s.isEmpty();
		newlist = filterList2(list, predicate1);
		System.out.println("New non empty list using generics" + newlist);

		Predicate<String> predicate4 = s -> s.contains("Basic");
		newlist = filterList2(list, predicate2);
		System.out.println("New list contains basic using generics " + newlist);

		List<Integer> intList = List.of(1, 4, 6, 7, 8);
		Predicate<Integer> intPredicate = s -> s % 2 == 0;
		System.out.println("Even no list " + filterList2(intList, intPredicate));
	}

	private static List<String> filterList(List<String> list, Predicate<String> predicate) {
		List<String> lst = new ArrayList<>();

		for (String string : list) {
			if (predicate.test(string)) {
				lst.add(string);
			}
		}

		// same work
		// lst = list.stream().filter((s) ->predicate.test(s)).collect(Collectors.toList());
		return lst;
	}

	private static <T> List<T> filterList2(List<T> list, Predicate<T> predicate) {

		List<T> newList = new ArrayList<>();

		for (T string : list) {
			if (predicate.test(string)) {
				newList.add(string);
			}

		}
		// same work
		// newList = list.stream().filter((s) ->predicate.test(s)).collect(Collectors.toList());
		return newList;
	}

}
