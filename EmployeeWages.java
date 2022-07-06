import java.lang.Math;
import java.util.Random;
public class EmployeeWages {
	
	
	
	public static void main(String args[]) {
		
		System.out.println("Welcome to the Employee Wage computation programee");
		EmployeeWages emp=new EmployeeWages();
	    Random rand=new Random();
	    int r=rand.nextInt(3);
		System.out.println(r);
		
		int emp_wage_per_hr=20;
		int full_day_hr = 8;
		int half_day_hr = 4;
		double sal;
		int isPresent=1;
		int isAbsent=0;
		
		if(r == isPresent)
		{
			System.out.println("Employee Is present");
			sal= emp_wage_per_hr * full_day_hr;
			System.out.println("Emp Full Day Sal :"+sal);
		}
		else if (r==isAbsent) {
			System.out.println("Employee is Absent");
			sal= 0;
			System.out.println("Emp Full Day Sal :"+sal);
		}
		else
		{
			System.out.println("Employee Is Half day");
			sal= emp_wage_per_hr * half_day_hr;
			System.out.println("Emp half Day Sal :"+sal);
		}
		
	
	
	}

}
