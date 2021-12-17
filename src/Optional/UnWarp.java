package Optional;

import java.util.Optional;

public class UnWarp {

	public static void main(String[] args) {
		Integer a = 10;
		Optional<Integer> optional = Optional.of(a);

		// get

		System.out.println("value get " + optional.get());
		
		//dont use get
		Optional<Integer> emptyOp=Optional.empty();
		//emptyOp.get();
		
		//ispresent
		//Integer v= emptyOp.isPresent()?emptyOp.get():0;
		System.out.println("using is present "+(emptyOp.isPresent()?emptyOp.get():0));
		System.out.println("using is present "+(optional.isPresent()?optional.get():0));
		
		//orElse
		System.out.println("with orElse "+emptyOp.orElse(0));
		System.out.println("with orElse "+optional.orElse(0));
		
		//orelseget
		System.out.println("with orElseGet "+emptyOp.orElseGet(()->0));
		System.out.println("with orElseGet "+optional.orElseGet(()->0));
		
		//oeElseThrow
		System.out.println("with orElseThrow "+emptyOp.orElseThrow(()-> new IllegalArgumentException("Invalid Param")));
		System.out.println("with orElseThrow "+optional.orElseThrow(()-> new IllegalArgumentException("Invalid Param")));
	}

}
