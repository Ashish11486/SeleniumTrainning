package javaBasic;

public class Outer_Demo 
{
	private class Inner_Demo
	{
		public void print()
		{
			System.out.println("this is inner class");
		}
	}
	public void display_Inner(){
		Inner_Demo inClass = new Inner_Demo();
		inClass.print();
	}


		
		public static void main(String[] args) 
		{
			Outer_Demo outclass = new Outer_Demo();
			outclass.display_Inner();
		}
	}

