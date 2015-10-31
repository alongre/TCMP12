
public class Person {

	private String id;
	private String name;
	private String address;
	private int age;
	
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get address
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Set address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	
	
	/**
	 * @param id
	 * @param name
	 * @param address
	 * @param age
	 */
	public Person(String id, String name, String address, int age) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}

	/**
	 * @param id
	 */
	public Person(String id) {
	
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	
}
