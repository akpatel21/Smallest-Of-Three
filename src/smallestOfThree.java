/**
 * 
 * @author Akul Patel
 * Smallest Of Three
 * 
 */
import java.util.Scanner;

public class smallestOfThree 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Pick a number:  ");
		Double num1 = scan.nextDouble();
		System.out.print("Pick a second number:  ");
		Double num2 = scan.nextDouble();
		System.out.print("Pick a third number:  ");
		Double num3 = scan.nextDouble();
		
		System.out.print("The smallest number is " + smallestFour(num1, num2, num3));

	}
	
	public static double smallestFour(double num1, double num2, double num3)
	{
		double smallest;
		if(num1 < num2 && num1 < num3)
		{
			smallest = num1;
		}
		else if(num2 < num1 && num2 < num3)
		{
			smallest = num2;
		}
		else if(num3 < num1 && num3 < num2)
		{
			smallest = num3;
		}
		else if(num1 == num2)
		{
			smallest = num1;
		}
		else if(num1 == num3)
		{
			smallest = num1;
		}
		else if(num2 == num3)
		{
			smallest = num2;
		}
		else
		{
			smallest = num1;
		}
		
		return smallest;
		
	}	

}
