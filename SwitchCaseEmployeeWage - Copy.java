import java.util.Random;
public class SwitchCaseEmployeeWage {
	
	public static void main(String args[]) {
			
			System.out.println("Welcome to the Employee Wage computation programee");
			
		    Random rand=new Random();
			final int emp_wage_per_hr=20;
			final int fullTime = 8;
			double sal=0;
			final int Present=1;
			final int Absent=0;
			int empHr;
			int empTotalHr=0;
			double totalSalary=0;
			
			
				
				for(int day=0;day<20;day++) {
					
					while(empTotalHr <60- 4) {
					
					int isPresent=rand.nextInt(3);
					switch (isPresent) {
					
					case Present: 
						
					    empHr=fullTime; 
					    System.out.print(" P ");
					    break;
					    
					case Absent:
						
						empHr=Absent;
						System.out.print(" A ");
						break;
					default:
						
						empHr=fullTime/2;
						System.out.print(" H ");
						break;
					}
							
		           sal=emp_wage_per_hr*empHr;
		          // System.out.println("Employee Salary is : $ " +sal+" USD");
		           
		           totalSalary=totalSalary+sal;
		           empTotalHr=empTotalHr+empHr;
					
				}
				
			}
			
			
			System.out.println(".");
			System.out.println("Total hr :"+empTotalHr);
			System.out.print("Employee Monthly salary :$"+totalSalary+" USD");
	}


}
