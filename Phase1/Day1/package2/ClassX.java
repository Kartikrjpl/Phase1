package package2;

public class ClassX {
	private int s = 100;
	long l1 = 100000L;
	protected float f1 = 100.00111f;
	public char c = 'F';
	public void displayVar_X() {
		display_private_X();
	}
	public void display_private_X() {
		System.out.println("Private integer of ClassX "+s);
		System.out.println("Default long of class X "+l1);
		System.out.println("protected float of class X "+f1);
		System.out.println("Character of class X "+c);
	}
	
	
}
