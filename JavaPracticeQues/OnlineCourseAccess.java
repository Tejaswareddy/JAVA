import java.util.Scanner;
import java.time.LocalDate;

class OnlineCourseAccess 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter if the Fees is paid");
		String fees = s.nextLine();
		System.out.println("Schorship for the student");
		Boolean Scholor = s.nextBoolean();
		System.out.println("Expiration of the book year");
		int Expiration_year = s.nextInt();
		s.nextLine();
		System.out.println("Expiration of the book month");
		String Expiration_month = s.nextLine();
		if (fees || Scholor && Expiration_year != 2026 && Expiration_month != jan){
			System.out.println("Course is accessible");
		}else{
			System.out.println("Course is not accessible");
			
		s.close();
	}
}
