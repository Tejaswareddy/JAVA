import java.util.Scanner;
class ReturnToMain
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num");
		 int age = s.nextInt();
		 s.nextLine();
		 System.out.println("Hello name!");
		 String name = s.nextLine();
		
		String result = Details(age, name);
		System.out.println(result);
	}
	public static String Details(int age, String name){
		return name + age;
	}
}
