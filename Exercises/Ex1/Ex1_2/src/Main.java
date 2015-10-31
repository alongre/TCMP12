
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person [] persons = new Person[3];
		persons[0] = new Person("043243455");
		persons[1] = new Person("43434343","Alon","Nahariyya",37);
		persons[2] = new Person("34234","Tom","Nahariyya",3);
		
		persons[0].setAge(25);
		persons[0].setName("Yuval");
		persons[0].setAddress("Haifa");
		
		for (Person person : persons) {
			System.out.println(person.toString());
		}
	}

}
