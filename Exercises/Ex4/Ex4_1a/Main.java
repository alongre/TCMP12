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

		CustomerContainer customerContainerTreeSet = new CustomerContainer();
		customerContainerTreeSet.add(a);

		customerContainerTreeSet.add(b);
		customerContainerTreeSet.add(c);
		customerContainerTreeSet.add(d);
		customerContainerTreeSet.add(e);
		customerContainerTreeSet.add(f);
		customerContainerTreeSet.print();


	}

}
