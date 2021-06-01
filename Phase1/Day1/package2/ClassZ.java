package package2;

import package1.ClassM;
import package1.ClassN;
import package1.ClassP;
// In this package i can not call the private and default methods of classM and class N ( class p doesnt have any method )
// here i can call public method of classN directly
// protected and public method of classM is also called directly
public class ClassZ extends ClassM{
	
	public static void main(String[] args) {
		ClassM objm = new ClassM();
		ClassN objn = new ClassN();
		ClassP objp = new ClassP();
		ClassZ objz = new ClassZ();
		objm.displayVar();
		objm.display_default();// reasoning mentioned in classy.java
		
		objn.displayVar_pub();
		objn.display_default();
		objn.display_protected();
		
		objz.disp_prot();
		ClassX objx = new ClassX();
		System.out.println("default long of class X "+objx.l1);
		System.out.println("public character of class X "+objx.c);
		System.out.println("Protected float of class X "+objx.f1);
		
		
	}
	
	
	
	
	

}
