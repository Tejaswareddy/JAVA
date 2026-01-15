class CpuStability
{
	public static void main(String[] args) 
	{
		int cpuUse = 85;
		int memUse = 95;
		String r = (cpuUse>85 || memUse>95)?"CPU unstable":"CPU is fine";
		System.out.println(r);
	}
}
