class OrderStatus
{
	public static void main(String[] args) 
	{
		boolean payStatus = true;
		boolean stockAvail = true;
		boolean backOrder = true;
		int r = (payStatus && stockAvail || backOrder)?"Order Successful":"Order Cancelled";
		System.out.println(r);
	}
}
