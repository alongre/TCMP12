import java.util.Calendar;

public class Main {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		RegCustomer a = new RegCustomer("a","Haifa",calendar.getTime());
		VipCustomer b = new VipCustomer("B","TLV",50);
		RegCustomer c = new RegCustomer("c","AKKO",calendar.getTime());
		VipCustomer d = new VipCustomer("D","Ashdod",40);
		RegCustomer e = new RegCustomer("e","Haifa",calendar.getTime());
		VipCustomer f = new VipCustomer("F","Haifa",80);


		CustomerContainer customerContainerHashSet = new CustomerContainer();

		RegCustomer copyA = new RegCustomer("a","Haifa",calendar.getTime());
		customerContainerHashSet.add(a);
		customerContainerHashSet.add(b);
		customerContainerHashSet.add(c);
		customerContainerHashSet.add(d);
		customerContainerHashSet.add(e);
		customerContainerHashSet.add(f);
		customerContainerHashSet.add(copyA);
	}

}
