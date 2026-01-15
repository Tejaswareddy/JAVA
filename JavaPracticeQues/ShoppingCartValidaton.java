import java.util.Scanner;

class ShoppingCartValidation 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter cart status");
		String cart_status = s.nextLine();
		System.out.println("Enter Delivery Address");
		String delAdd = s.nextLine();
		Boolean delAdd = true;
		if(cart_status != null && delAdd){
			System.out.println("Your cart is valid");
		}
		else{
			System.out.println("Your cart is not valid");
		}
		
		s.close();
	}
}
