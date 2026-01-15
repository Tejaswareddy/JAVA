import java.util.Scanner;

class RailTicketConfirmation
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("User Ticket");
		int UserTicket = s.nextInt();
		System.out.println("How many seats are available");
		int seatsAvail = s.nextInt();
		System.out.println("How many seats are available in RAC");
		int RacseatsAvail = s.nextInt();
		System.out.println("Hello World!");
		if(UserTicket){
			if(seatsAvail > 0){
				System.out.println("Your seat is booked");
			}if else(seatsAvail == 0 && RacseatsAvail >0)
			{
				System.out.println("Your seat is WaitListed");
			}
			else{
				System.out.println("Your Ticket is Not able to get confirmed");
			}
			
			System.out.println("Your staus");
			Boolean TicketStatus = s.nextBoolean();
			System.out.println("Enter if you want to cancel ");
			String CancelReq = s.nextLine();
			System.out.println("Money will be refuned soon");
			s.close();
			
	}
}
