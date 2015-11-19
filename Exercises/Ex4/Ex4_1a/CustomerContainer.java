import java.util.TreeSet;

public class CustomerContainer {

	private TreeSet<Customer> customersTreeSet;

	
	public CustomerContainer()
	{
		customersTreeSet = new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));
	}

	 public boolean add( Customer customer)
	 {
		 return customersTreeSet.add(customer);
	 }

	

	 public boolean remove( Customer customer)
	 {
		 return customersTreeSet.remove(customer);
	 }

	 public void removeAll()
	 {
		 customersTreeSet.clear();
	 }
	 public void print() {
		 System.out.println(customersTreeSet.toString());
		 System.out.println("*********************");
	 }

}
