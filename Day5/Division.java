import java.util.*;
public class Division{
	
	public static void main(String args[]){
		
		System.out.println("Enter the number that you want divide : \n Divident :");
		Scanner sc=new Scanner(System.in);
		double divident=sc.nextDouble();
		System.out.println("Enter the number divisior:");
		double divisior=sc.nextDouble();
		
		double quotient= divident/divisior;
		System.out.println("The Quotient is :"+quotient);
		
		double reminder=divident%divisior;
		System.out.println("The Reminder is :"+reminder);
		
	}
}