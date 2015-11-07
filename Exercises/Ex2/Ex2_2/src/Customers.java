
public class Customers {
	private Customer[] customerList;
	public Customers(Customer[] customerList)
	{
		this.customerList = customerList;
	}
	public void print()
	{
		for (Customer customer : customerList)
		{
			System.out.println(customer.toString());
			System.out.println("*********************");
		}
	}
	public int count()
	{
		return customerList.length;
	}
}
