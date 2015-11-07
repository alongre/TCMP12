import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Customer {
	protected String name;
	protected String address;
	protected Date registerDate;
	protected int totalMoneyToPay;
	protected String id;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
	public int getTotalMoneyToPay() {
		return totalMoneyToPay;
	}
	
	public Customer()
	{
		id = java.util.UUID.randomUUID().toString();
		Calendar cal = Calendar.getInstance();
		registerDate = cal.getTime();
		totalMoneyToPay = 0;
		name = "John Doe";
		address = "Unknown";
	}
	public Customer(String name)
	{
		this();
		this.name = name;
	}
	public Customer(String name,String address)
	{
		this();
		this.name = name;
		this.address = address;
	}
	public void addToPayment(int amount)
	{
		totalMoneyToPay += amount;
	}
	protected String formatString(Date date)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		return formatter.format(date);
	}
	@Override
	public String toString()
	{
		
		return "Customer: " + name + "\nID: " + id + "\nAddress: " + address 
				+ "\nFirst bought date: " + registerDate.toString() 
				+ "\nTotal money to pay: " + totalMoneyToPay;
	}
}
