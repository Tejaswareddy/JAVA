class ApplicationUsage
{
	public static void main(String[] args) 
	{
		int age = 20;
		boolean banned = true;
		String r = (age>=18 && banned)?"Can access":"Cannot Access";
		System.out.println(r);
	}
}
