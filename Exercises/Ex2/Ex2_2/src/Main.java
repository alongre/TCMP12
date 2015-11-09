import java.util.Calendar;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2015,Calendar.JULY, 29);
		Customer [] customers = new Customer[3];
		customers[0] = new VipCustomer("Alon","Shaked st",20);
		customers[0].addToPayment(100);
		customers[1] = new RegCustomer("Roy","Shaked st",cal.getTime());
		customers[1].addToPayment(500);
		customers[2] = new VipCustomer("Tom","Shaked st",50);
		customers[2].addToPayment(1000);
		Customers customerList = new Customers(customers);
		customerList.print();
	}

}
