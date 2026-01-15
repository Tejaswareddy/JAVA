import java.util.Scanner;

class AttendanceSystem 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many hourd soes the employee worked");
		int Emp_time = nextInt();
		if(Emp_time >= 8){
			System.out.println("Present");
		}if else(Emp_time >=4 && Emp_time<8)
		{
			System.out.println("Half Day");
		}else{
			System.out.println("Absent");
		}
		s.close();
		
	}
}
