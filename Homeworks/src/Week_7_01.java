// 07_1. Person and Customer


public class Week_7_01 {
	
	public static void main(String[] args) {
		
		Person71 p1 = new Person71(); 
		Person71 p2 = new Person71("Tom"); 
		Customer71 c1 = new Customer71(); 
		Customer71 c2 = new Customer71("Jane");
		Customer71 c3 = new Customer71("Jack", "Seoul", 300); 
		
		showPerson(p1); 
		showPerson(p2);
		showPerson(c1);
		showPerson(c2);
		showPerson(c3);
		System.out.println(); 
		
		p1.setName("Luk");
		c1.setName("Tim");
		c2.setCity("Busan");
		c1.setMoney(500);
		c2.setMoney(200);
		
		showPerson(p1); 
		showPerson(p2);
		showPerson(c1);
		showPerson(c2);
		showPerson(c3);
		System.out.println(); 
		
		c1.purchase(200);
		c2.purchase(300);
		c3.purchase(100);
		
		System.out.println(); 
		showPerson(c1);
		showPerson(c2);
		showPerson(c3);
	}
	
	static void showPerson(Person71 p) {
	
		String returnSentence = p.toString();
		System.out.println(returnSentence);
	}
}




class Person71 {
	
	private String name;
	
	public Person71() {
		this.name = "NoName";
	}
	
	public Person71(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		String returnString = String.format("name(%s)",name);
		return returnString;
	}
	
	public String getName() {
		return name;
	}
	
}

class Customer71 extends Person71{
	
	private String city;
	private int money;
	
	public Customer71() {
		super();
		city = "NoCity";
		money = 0;
	}
	
	public Customer71(String name) {
		super(name);
		city = "NoCity";
		money = 0;
	}
	
	public Customer71(String name, String city, int money) {
		super(name);
		this.city = city;
		this.money = money;
	}
	
	
	public void purchase(int cost) {
		
		if(this.money >= cost) {
			
			System.out.printf("SUCCESS: %s's %d purchase%n",this.getName(),cost);
			this.money -= cost;
		}
		else {
			System.out.printf("FAIL: %s's %d purchase%n",this.getName(),cost);
		}
		
	}
	
	
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString() {
		String returnString = String.format("name(%s) city(%s) money(%d)",this.getName(),city,money);
		return returnString;
	}
}























