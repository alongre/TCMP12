
public class VipCustomer extends Customer {

	private String clubId;
	private int discount;
	/**
	 * @return the discount
	 */
	public int getDiscount() {
		return discount;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	/**
	 * @return the clubId
	 */
	public String getClubId() {
		return clubId;
	}
	/**
	 * 
	 */
	public VipCustomer(int discount) {
		super();
		clubId = java.util.UUID.randomUUID().toString();
		this.discount = discount;
	}
	/**
	 * @param name
	 * @param address
	 * @param discount
	 */
	public VipCustomer(String name, String address,int discount) {
		super(name, address);
		clubId = java.util.UUID.randomUUID().toString();
		this.discount = discount;
		
	}
	/**
	 * @param name
	 */
	public VipCustomer(String name,int discount) {
		super(name);
		clubId = java.util.UUID.randomUUID().toString();
		this.discount = discount;
	}
	
	@Override
	public void addToPayment(int amount)
	{
		totalMoneyToPay += amount * discount/100;
	}
	@Override
	public void print()
	{
		System.out.println(toString());
	}
	@Override
	public String toString()
	{
		
		return "Customer: " + name + "\nID: " + id + "\nAddress: " + address 
				+ "\nClub ID: " + clubId
				+ "\nDiscount: " + discount + "%"
				+ "\nFirst bought date: " + formatString(registerDate)
				+ "\nTotal money to pay: " + totalMoneyToPay;
	}
}
