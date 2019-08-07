package javaBasic;

public class ConstructorConcepts {

	public static void main(String[] args) {
		ConstructorConcepts cc = new ConstructorConcepts("Ashish");
		

	}
	public ConstructorConcepts(String myname){
		System.out.println("inside the constructor");
		System.out.println(myname);
	}

}
