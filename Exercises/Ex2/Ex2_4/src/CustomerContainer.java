
public class CustomerContainer {

	private Customer[] customersList;
	public CustomerContainer (int size)
	{
		if (size>0)
		{
			customersList = new Customer[size];
		}
	}

	 public boolean add( Customer customer)
	 {
		 
	 }
	 private boolean contains(Customer customer)
	 {
		 for(Customer cust:customersList)
		 {
			 if (cust.equals(customer)) return true;
		 }
		 return false;
	 }
	
	 public void drawAll()
	 {
		 
	 }

	 public boolean remove( int index)
	 {
		 
	 }

	 public boolean remove( Customer c)
	 {
		 
	 }
	 

	 public boolean removeAll()
	 {
		 
	 }

	 public void resizeAll ( int percent )
	 {
		 
	 }
	
	
}
