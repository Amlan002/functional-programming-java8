package FunctionalInterface;

@FunctionalInterface
public interface FunctionalGenerics<T,R> {
	R execute(T t);// R -return type, T -type of input arguments
}
