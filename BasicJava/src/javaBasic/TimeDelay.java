package javaBasic;

import java.util.Date;

public class TimeDelay {

	public static void main(String[] args) {
		try
		{
			for (int i = 0; i < 10; i++) 
			{
				System.out.println(new Date() +"\n");
				Thread.sleep(3000);
				
			}
			System.out.println(new Date() +"\n");
		}
		catch (Exception e)
		{
		System.out.println("Got Exception");
		}
	}

}
