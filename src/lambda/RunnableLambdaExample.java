package lambda;

public class RunnableLambdaExample {

	public static void main(String[] args) {

		Runnable runnable1=()->{
			System.out.println("Inside of runnable1");
		};
		Runnable runnable2=()->System.out.println("Inside of runnable2");

		
		new Thread(()->System.out.println("Inside of runnable3")).start();
		new Thread(runnable1).start();
		new Thread(runnable2).start();
	}

}
