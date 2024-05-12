package p1;
//@FunctionalInterface
interface Formula {
	double calculate(double a);// public and abstract : added implicitly by javac
	// public : added implicitly by javac

	default double sqrt(double a, double b) {
		return Math.sqrt(a + b);
	}
}
