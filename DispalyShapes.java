import java.util.Scanner;

class DispalyShapes1
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the areas of the shapes you want to know \n 1. Rectangle \n 2. Square");
		int value = s.nextInt();
		switch(value){
			case 1:
				
				System.out.println(Rec());
		}
		
	}
	public static double Rec(double l, double b){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter l");
				l = s.nextDouble();
				System.out.println("Enter l");
				b = s.nextDouble();
		return l*b;
	}
	public static double square(double s){
		return s*s;
	}
	
	
}
