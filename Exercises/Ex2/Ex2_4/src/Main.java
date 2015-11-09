import java.util.Calendar;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2015,Calendar.JULY, 29);
		Customer customer1 = new Customer("Alon","Shaked st");
		customer1.addToPayment(100);
		Customer customer2 = new RegCustomer("Roy","Shaked st",cal.getTime());
		customer2.addToPayment(500);
		Customer customer3 = new VipCustomer("Tom","Shaked st",50);
		customer3.addToPayment(1000);
		
		
		//Customers customerList = new Customers(customers);
		
		CustomerContainer ct = new CustomerContainer(5);
		ct.add(customer1);
		ct.add(customer2);
		ct.add(customer3);
		ct.print();
		System.out.println("Removed index 1");
		ct.remove(1);
		ct.print();
		System.out.println("added Roy again");
		ct.add(customer2);
		ct.print();
		System.out.println("Removed alon");
		ct.remove(customer1);
		ct.print();
		System.out.println("Removed all");
		ct.removeAll();
		ct.print();
		
		
	}

}
