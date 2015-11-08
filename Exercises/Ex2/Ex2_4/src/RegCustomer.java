import java.text.SimpleDateFormat;
import java.util.Date;

public class RegCustomer extends Customer {
	private Date birthDate;
	public Date getBirthDate()
	{
		return birthDate;
	}
	public void setBirthDate(Date birthDate)
	{
		this.birthDate = birthDate;
	}
	/**
	 * 
	 */
	public RegCustomer(Date birthDate) {
		super();
		this.birthDate = birthDate;
		
	}
	/**
	 * @param name
	 * @param address
	 */
	public RegCustomer(String name, String address,Date birthDate) {
		super(name, address);
		this.birthDate = birthDate;
	}
	/**
	 * @param name
	 */
	public RegCustomer(String name,Date birthDate) {
		super(name);
		this.birthDate = birthDate;
		
	}
	@Override
	public void print()
	{
		System.out.println(toString());
	}
	@Override
	public String toString()
	{
		
		return "Customer: " + this.name + "\nID: " + id + "\nAddress: " + address 
				+ "\nBirth date: " + formatString(birthDate)
				+ "\nFirst bought date: " + formatString(registerDate)
				+ "\nTotal money to pay: " + totalMoneyToPay;
	}
	
}
