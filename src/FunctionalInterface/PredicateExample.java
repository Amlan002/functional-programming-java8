package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> predicate1 = (a) -> a % 2 == 0;
	static Predicate<Integer> predicate2 = (a) -> a % 5 == 0;

	public static void predicateAnd() {
		System.out.println("predicateAnd1 -" + predicate1.and(predicate2).test(10));
		System.out.println("predicateAnd2 -" + predicate1.and(predicate2).test(12));
	}

	public static void predicateOr() {
		System.out.println("predicateOr1 -" + predicate1.or(predicate2).test(10));
		System.out.println("predicateOr2 -" + predicate1.or(predicate2).test(12));
		System.out.println("predicateOr2 -" + predicate1.or(predicate2).test(9));
	}
	
	public static void predicateNegate() {
		System.out.println("predicateNegate1 -" + predicate1.or(predicate2).negate().test(10));
		System.out.println("predicateNegate2 -" + predicate1.or(predicate2).negate().test(12));
		System.out.println("predicateNegate3 -" + predicate1.or(predicate2).negate().test(9));
	}

	public static void main(String[] args) {

		System.out.println(predicate1.test(12));
		predicateAnd();
		predicateOr();
		predicateNegate();
	}

}
