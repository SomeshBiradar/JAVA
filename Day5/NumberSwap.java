import java.util.*;
public class NumberSwap{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Value :");
		int first=sc.nextInt();
		System.out.println("Enter Second Value :");
		int second=sc.nextInt();
		
		int temp=first;
		first=second;
		second=temp;
		System.out.println("Now First Value is :"+first);
		System.out.println("Now Second Value is :"+second);
	}
}