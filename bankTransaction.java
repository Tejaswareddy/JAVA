class bankTransaction
{
	public static void main(String[] args) 
	{
		boolean AccBalaSuffi = true;
		boolean active = true;
		boolean accFroze = false;
		String r = (AccBalasuffi && active && accFroze)?"Transaction is Possible":"Transaction is not possible";
		System.out.println(r);
	}
}
