package Collections;

import java.sql.SQLException;
import java.util.Scanner;

public class ScannerClass {
	public static void Exception() throws Throwable{
		throw new NullPointerException("Throwing Nullpoint exception");
	}	
		

	public static void Scanner() throws Throwable {
		
		Scanner scan = new Scanner(System.in);
		try {
		
		System.out.println("Enter your Name");
		String name = scan.next();
		
System.out.println("Enter your age");
int age = scan.nextInt();

System.out.println("Enter your Level");
byte level = scan.nextByte();

System.out.println("Enter your height");
float height = scan.nextFloat();

System.out.println("Enter your weight");
double weight = scan.nextDouble();

System.out.println("Enter your pincode");
short pincode = scan.nextShort();

System.out.println("Enter your mobile no.");
long mobileno = scan.nextLong();

System.out.println("Are you a human?");
boolean human = scan.nextBoolean();
	

	}
catch(Exception e)
		{
	
Exception();

		}
	
	}
public static void main(String[]args) throws Throwable{
	
	Scanner();
	


		}	


	}


