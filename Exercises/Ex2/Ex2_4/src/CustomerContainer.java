
public class CustomerContainer {

	private Customer[] customersList;
	private int index;
	
	public CustomerContainer (int size)
	{
		index = 0;
		if (size>0)
		{
			customersList = new Customer[size];
		}
	}

	 public boolean add( Customer customer)
	 {
		 if (index<customersList.length && index>=0 && !contains(customer))
		 {
			 customersList[index++] = customer;
			 return true;
		 }
		 return false;
	 }
	 private boolean contains(Customer customer)
	 {
		 for(Customer cust:customersList)
		 {
			 if (cust == null) break;
			 if (cust.equals(customer)) return true;
		 }
		 return false;
	 }
	
	 public boolean remove( int arrayIndex)
	 {
		 if (arrayIndex>=0 && index<customersList.length)
		 {
			 //last item on the array
			 if (arrayIndex == customersList.length-1)
			 {
				 customersList[index--] = null;
				 return true;
			 }
			 for (int i = arrayIndex;i<customersList.length-1;i++)
			 {
				 customersList[i] =  customersList[i+1];
			 }
			 index--;
			 return true;
		 }
		 return false;
	 }

	 public boolean remove( Customer customer)
	 {
		 if (index<customersList.length && index>=0 && contains(customer))
		 {
			 int locatedIndex = getIndex(customer);
			 return remove(locatedIndex);
		 }
		 return false;
	 }
	 private int getIndex(Customer customer)
	 {
		 for (int arrayIndex=0;arrayIndex<customersList.length;arrayIndex++)
		 {
			 if (customersList[arrayIndex].equals(customer)) return arrayIndex;
		 }
		 return -1;
	 }

	 public boolean removeAll()
	 {
		 if (customersList.length == 0) return false;
		 for (int index = 0; index<customersList.length;index++)
		 {
			 customersList[index] = null;
		 }
		 index = 0;
		 return true;
	 }
	 public void print()
	 {
		for (Customer customer : customersList)
		{
			if (customer==null) break;
			System.out.println(customer.toString());
			System.out.println("*********************");
		}
		System.out.println("Array index: " + index);
		System.out.println("Array Size: " + customersList.length);
	}
}
