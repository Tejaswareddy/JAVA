class NumberType 
{
	public static void main(String[] args) 
	{
		int n = 0;
		String Pos=" ";
		String Neg = " ";
		int Neu = 0;
		String r = ((n>0)?"Pos":"Neg")==Neu?"Neutral":"FAiled"; 
		System.out.println(r);
	}
}
