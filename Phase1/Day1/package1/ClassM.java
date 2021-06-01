package package1;

public class ClassM {
	private int pvt = 10;
	long l1 = 1000L;
	protected float f1 =10.00f;
	
	public void displayVar() {
		System.out.println("Displaying Public Method of class M------------------");
		System.out.println("__NEXT LINE IS INDIRECT CALL_____");
		display_private();
	}
	protected void disp_prot() {
		System.out.println("Calling protected function of M------------------");
	}
	void disp_default() {
		System.out.println("Calling default function of M------------------");
	}
	public void display_protected() {
		System.out.println("__NEXT LINE IS INDIRECT CALL_____");
		disp_prot();
	}
	public void display_default() {

		System.out.println("__NEXT LINE IS INDIRECT CALL_____");
		disp_default();
	}
	private void display_private() {
		System.out.println("Calling private method of M------------------");
		System.out.println("Private integer of ClassM "+pvt);
		System.out.println("Default long of class M "+l1);
		System.out.println("protected float of class m "+f1);
	}
	
	
	
	
}
