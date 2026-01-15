import java.util.Scanner;

class NpParaWithReturn
{
	public static void main(String[] args) 
	{
		System.out.println(m1() + m2());
	}
	public static int m1(){
		int x = 100;
		return x;
	}
	public static double m2(){
		int x = 200;
		return x;
	}
	public static String Details1(){
		Scanner s = new Scanner(System.in);
		String name = s.nextLine(); 
	}
}
