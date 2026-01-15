class DiscountChecker
{
	public static void main(String[] args) 
	{
		boolean Premium = true;
		float Cart_value = 556;
		String r = (Premium || Cart_value > 5000)?"Disount Is Approved":"No Disount";
		System.out.println(r);
	}
}
