class SystemBackup
{
	public static void main(String[] args) 
	{
		boolean MidNight = true;
		boolean ServerLoad = false;
		boolean SysMainMode = true
		String r = (MidNight && ServerLoad || SysMainMode)?"Backup is running":"Back up is Not running";
		System.out.println(r);
	}
}
