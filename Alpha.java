class Alpha
{
	public static void main(String[] args) 
	{
		char c = '1'; 
		String r = (c>='A' && c<='Z' || c>='a' && c<='b' )?"Alpha":"Number";
		System.out.println(r);
	}
}
