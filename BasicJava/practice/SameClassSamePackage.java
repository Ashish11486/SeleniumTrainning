package practice;

public class SameClassSamePackage {

	public static void main(String[] args) 
	{
		SameClassSamePackage scsp = new SameClassSamePackage();
		scsp.publicMethod();   //public method of any class can be called by any class under same or different package but under same project
		scsp.privateMethod(); //Private method of same class can be called by the same class only , not by any other class of the same package or class of other package or project
		scsp.defaultMethod();  //default method can be called in any class inside the same package but not outside the package.
		scsp.potectedMethod(); //same as default but if you want to access it in other package then use inheretance(extends) concept
	}
	public void publicMethod(){
		System.out.println("Public Method");
	}
	private void privateMethod(){
		System.out.println("Private method");
	}
	void defaultMethod(){
		System.out.println(" Default Method");
	}
	protected void potectedMethod(){
		System.out.println("Protected Method");
	}
}
