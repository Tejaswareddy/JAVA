import java.util.Scanner;

class EmployeeWorkAreaCapgemini 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age");
		int age = s.nextInt();
		System.out.println("Enter gender");
		String gender = s.nextLine();
		if(age >= 20 && age = 60 &&gender == 'F'){
			System.out.pritnln("You will work in urban area");
		}else if(age>=20 && age<=40 && gender == 'M'){
			System.out.println("You have to work in location given by company");
		}else if(age>40 && age<=60 && gender == 'M'){
			System.out.println("You can work in urban or anywhere you want");
		}else{
			System.out.println("Error! Enter the correct Input");
		}
		s.close();
	}
}
