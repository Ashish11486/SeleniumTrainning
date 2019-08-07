package practice;

public class ParameterizedConstructor 
{
	int x,y;
	ParameterizedConstructor(int i)
	{
		x=i;
		y=x+1;
	}
	public static void main(String[] args) 
	{
		ParameterizedConstructor x1 = new ParameterizedConstructor(10);
		ParameterizedConstructor x2 = new ParameterizedConstructor(20);
		System.out.println(x1.y + " " + x2.x);
		

	}

}
