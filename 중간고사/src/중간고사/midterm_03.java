package 중간고사;

public class midterm_03 {

	public static void main(String[] args) {
		
		Address a1 = new Address(); 
		Address a2 = new Address("Seoul", "Jong-ro", 32);  // city, road, number
		Address a3 = new Address("Busan", "Gunam-ro", 45); 
		Address a4; 
		Building b1 = new Building(); 
		Building b2 = new Building("Heaven", 1995, a2); // name, year, address
		Building b3 = new Building("Angel", 2008, a3); 
		
		System.out.println(a1);
		System.out.println(a2); 
		System.out.println(a3); 
		System.out.println(); 
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3); 
		System.out.println(); 
		
		b1.set("Joy", 2012, a1);
		a1.set("Sejong",  "One-ro", 177);
		
		System.out.println(a1);
		System.out.println(a2); 
		System.out.println(a3); 
		System.out.println(); 
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3); 	
		System.out.println(); 
		
		a4 = new Address(a2);
		
		System.out.println(a4);
		System.out.println(); 
		System.out.println("a4 == a2 ? " + a4.equals(a2));
		System.out.println("a4 == a1 ? " + a4.equals(a1));
		System.out.println("a4 == b1 ? " + a4.equals(b1));
		
		a1.set("Seoul", "Jong-ro", 32);
		System.out.println("a4 == a1 ? " + a4.equals(a1));

	}
}

class Address{
	String city;
	String road;
	int number;
	
	
	
	public Address() {
		this.city = "nocity";
		this.road = "noroad";
		this.number = 0;
	}
	
	public Address(String city, String road, int number) {
		this.city = city;
		this.road = road;
		this.number = number;
	}
	
	public Address(Address add) {
		this.city = add.getCity();
		this.road = add.getRoad();
		this.number = add.getNumber();
	}
	
	public void set(String city, String road, int number) {
		this.city = city;
		this.road = road;
		this.number = number;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getRoad() {
		return road;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String toString() {
		
		String returnString = String.format("[ADDR] city(%s) road(%s) num(%d)", city, road, number);
		return returnString;
	}
	
	public boolean equals(Address add) {
		if(this.city.equals(add.getCity()) && this.road.equals(add.getRoad()) && this.number==add.getNumber()) {
			return true;
		} else {
			return false;
		}
	}
	
}

class Building{
	
	String name;
	int year;
	Address address;
	
	public Building() {
		this.name = "noname";
		this.year = 0;
		this.address = new Address();
	}
	
	public Building(String name, int year, Address add) {
		this.name = name;
		this.year = year;
		this.address = new Address(add);
	}
	
	public String toString() {
		String returnString = String.format("[BUILDING] name(%s) year(%d) addr([ADDR] city(%s) road(%s) num(%d))",name,year,address.getCity(),address.getRoad(),address.getNumber());
		return returnString;
	}
	
	public void set(String name, int year, Address add) {
		this.name = name;
		this.year = year;
		this.address = new Address(add);
	}
	
	public int getYear() {
		return year;
	}
	
	public String getName() {
		return name;
	}
	
	public Address getAddress() {
		return new Address(this.address);
	}
	
	public boolean equals(Building b) {
		if(address.equals(b.getAddress()) && name.equals(b.getName()) && year==b.getYear()){
			return true;
		}
		else {
			return false;
		}
	}
	
}






















