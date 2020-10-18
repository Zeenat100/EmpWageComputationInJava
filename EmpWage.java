public class EmpWage
{
	public static void main (String args[])
	{
	System.out.println("Welcome to employee wage computation");
	int IS_FULL_TIME = 1;
	int emp_rate_per_hr=20;
	int empHrs=0;
	int empWage=0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
	if (empCheck == IS_FULL_TIME)
		empHrs=8;
	empWage = empHrs * emp_rate_per_hr;
	System.out.println("Employee daily Wage: " +empWage);
	}
}
