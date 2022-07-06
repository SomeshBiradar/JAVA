import java.util.Scanner;
public class LargestNumber{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int x=sc.nextInt();
		System.out.println("Enter Second number");
		int y=sc.nextInt();
		System.out.println("Enter Third number");
		int z=sc.nextInt();
		
		
		if(x>y && x>z){
			
			System.out.println("First Value is LargestNumber");
		}
		else if(y>z){
			
			System.out.println("Second Value is LargestNumber");
		}
		else{
			
			System.out.println("Third Value is LargestNumber");
		}
		
	}
}