package javaBasic;

import java.util.Scanner;

public class Marksheet
{

	//@SuppressWarnings("null")
	public static void main(String[] args) 
	{
		//@SuppressWarnings("resource")
		int total=0;
		Scanner value = new Scanner(System.in);		
		String[] subjects = new String[5];
		for (int i = 0; i < subjects.length; i++)
		{
			System.out.print("Enter Name of Subjects "+(i+1)+" : ");
			subjects[i] = value.next();
		}
		for (int i = 0; i < subjects.length; i++)
		{
			System.out.println("Subject No " + (i+1) +" is " +subjects[i]);
		}
		
		for (int i = 0; i < subjects.length; i++)
		{
			total=marks(subjects[i])+ total;
		}
		System.out.println("Total Marks Obtained : " + total);
		}
	private static int marks(String sub)
	{
		int marks1=0,marks2=0;
		Scanner value = new Scanner(System.in);
			for (int i = 0; i < 2; i++)
			{	System.out.print("Enter marks 1st time for " +sub + " : ");		
				marks1 = value.nextInt();
				if (marks1>=00 && marks1<=100 && marks2>=0 && marks2<=100)
				{
					System.out.println("Entered marks for " + sub + " is " + marks1 );
					System.out.print("Entered marks 2nd time for " + sub + " : " );
					marks2 = value.nextInt();
					if (marks1==marks2 && marks1<35)
					{
						System.out.println("Student is fail in " + sub);
						i+=1;
					}else if(marks1==marks2 && marks1>=35) 
					{
						System.out.println("Student is Pass in " + sub);
						i+=1;
					}else 
					{
						System.out.println("Entered marks is different from 1st entry ");
						i-=1;
					}
				}else if(marks1<0 || marks1>100 || marks2<0 || marks2>100)
				{
					System.out.println("Invalid Marks ");
					i -= 1;
				}
			}
		return marks1;
	}

}
