//Day 4 = control statements - Morning

import java.util.Scanner;

class BookingValidation
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter location");
		String userLoc = s.nextLine();
		System.out.println("Enter the location of the driver");
		String DriLoc = s.nextLine();
		System.out.println("time to reach location of the userer");
		int time = s.nextInt();
		System.out.println("Enter the payment method");
		s.nextLine();
		String Pay = s.nextLine();
		if(time < 15 && pay == 'Cash' || pay == "UPI"){
			System.out.println("Booking is accepted");
		}
	}
}
