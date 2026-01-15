class EntryChecker
{
	public static void main(String[] args) 
	{
		boolean ID = true;
		boolean Perm = true;
		boolean Temp = false;
		String r = (ID && Perm || Temp)?"Can Enter":"Cannot Enter";
		System.out.println(r);
	}
}
