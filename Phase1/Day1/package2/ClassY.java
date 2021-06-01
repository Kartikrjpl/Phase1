package package2;

import package1.ClassM;
import package1.ClassN;

public class ClassY extends ClassN{
	
	public static void main(String[] args) {
		
		// here default and private methods cant be called directly
		// to call the private method of N, I have added a public method.
		// however i can call the protected method also by just adding a 
		//new public method to class n object (mentioned in comments in class N)
		
		
		ClassN objn = new ClassN();
		ClassY objy = new ClassY();
		
		objn.displayVar_pub();//indirectly calling the private method here only
		objn.display_protected();//it is a public method in class N that will display its proteceted method
		objn.display_default();// same concept mentioned above
		
		objy.displayVar_prot();
		
		ClassM objm = new ClassM(); // classm has to be made public to use it here
		objm.displayVar(); //will call public and private method in class M
		objm.display_protected(); // similar conect used for class N
		objm.display_default(); // similar conecpt used for class N
		
		ClassX objx = new ClassX();
		objx.displayVar_X();// this will print all the variables of class X
		
	}
}
