//Day 4 - Switch statement - Afternoon

import java.util.Scanner;

class MovieRatingSystem
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int rating;
		System.out.println("Enter the rating of movie");
		 rating = s.nextInt(); 
		
		
		switch(rating){
			case 1:
				if(rating <=3){
				System.out.println("Poor");
				break;
			}
				case 2:
				System.out.println("Average");
				break;
				case 3:
				System.out.println("Good");
				break;
				case 4:
				System.out.println("Excellent");
				break;
				
				default:
					System.out.println("Out of range");
		}
		s.close();
	}
}
