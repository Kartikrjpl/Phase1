package package1;

public class ClassN {
	protected long class_n_long = 1000000L;
	public int class_n_public_int = 10;
	double class_n_default_double = 100.000;
	public void displayVar_pub() {
		System.out.println("Calling public method of N ------------------");
		System.out.println("__NEXT LINE IS INDIRECT CALL_____");
		displayVar_pri();
	}
	protected void displayVar_prot() {
		System.out.println("Calling protected method of N ------------------");
//		displayVar_pri();
		
	}
	void displayVar_def() {
		System.out.println("Calling default method of N------------------");
	}
	public void display_protected() {

		System.out.println("__NEXT LINE IS INDIRECT CALL_____");
		displayVar_def();
	}
	public void display_default() {

		System.out.println("__NEXT LINE IS INDIRECT CALL_____");
		displayVar_def();
	}
	private void displayVar_pri() {
		System.out.println("Calling private method of N ------------------");
		System.out.println("Protected long of class N "+class_n_long);
		System.out.println("Public int of class N"+class_n_public_int);
		System.out.println("Default double of class N "+class_n_default_double);
	}
	
}
