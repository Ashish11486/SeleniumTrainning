package practice;

public class OtherClassSamePackage {

	public static void main(String[] args) {
		SameClassSamePackage scsp = new SameClassSamePackage();
		scsp.publicMethod();
		//scsp.privateMethod(); // private method of other class can not be called in other class, Package,project
		scsp.potectedMethod();
	}

}
