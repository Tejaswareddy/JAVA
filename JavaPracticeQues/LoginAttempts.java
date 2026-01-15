class LoginAttempts
{
	public static void main(String[] args) 
	{
		int login_att = 3;
		boolean account_lock = true;
		String r = (login_att<=3 && account_lock)?"Limit exceeded":"It's ok";
		System.out.println(r);
	}
}
