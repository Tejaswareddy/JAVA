class FeatureEnabling
{
	public static void main(String[] args) 
	{
		boolean UserLogin = true;
		boolean TermsAndCondition = true;
		String r = (UserLogin && TermsAndCondition)?"Features are enabled":"Features are not enabled";
		System.out.println(r);
	}
}
