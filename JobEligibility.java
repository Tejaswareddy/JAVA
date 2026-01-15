class JobEligibility
{
	public static void main(String[] args) 
	{
		int exp = 3;
		boolean StrongPro = true;
		boolean grad = true;
		String r = (exp>2 || StrongPro && grad)?"Eligible":"Not Eligible";
		System.out.println(r);
	}
}
