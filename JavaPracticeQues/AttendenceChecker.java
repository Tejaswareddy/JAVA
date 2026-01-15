class AttendenceChecker 
{
	public static void main(String[] args) 
	{
		int Attendence = 78;boolean MedCar = false;boolean Fee = true;
		String r = (Attendence >= 75 || MedCar && Fee)?"Can WRite":"Cannot Write";
		System.out.println(r);
	}
}
