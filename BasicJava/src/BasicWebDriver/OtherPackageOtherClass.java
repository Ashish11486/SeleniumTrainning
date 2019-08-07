package BasicWebDriver;

import practice.SameClassSamePackage;

public class OtherPackageOtherClass extends SameClassSamePackage{
	
public static void main(String[] args) {
	SameClassSamePackage scsp = new SameClassSamePackage();
	scsp.publicMethod();
	OtherPackageOtherClass opoc = new OtherPackageOtherClass();
	opoc.potectedMethod();
	
}
}
