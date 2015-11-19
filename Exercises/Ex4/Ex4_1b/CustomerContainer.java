import java.util.HashSet;

/**
 * Created by Agreen on 11/19/2015.
 */
public class CustomerContainer {
    private HashSet<Customer> customerHashSet;

    public CustomerContainer()
    {
        customerHashSet = new HashSet<>();
    }
    public boolean add( Customer customer)
    {
        boolean result = customerHashSet.add(customer);
        if (!result)
            System.out.println("********The following customer already exists:*******");
        else
            System.out.println("New customer was added:");
        customer.print();
        return result;
    }
    public boolean remove(Customer customer)
    {
        return customerHashSet.remove(customer);
    }
    public void removeAll()
    {
        customerHashSet.clear();
    }
    public void print()
    {
        System.out.println(customerHashSet.toString());
    }
}
