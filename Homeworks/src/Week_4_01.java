// 04_1. Accessor, Mutator, toString, equals

public class Week_4_01 {

	public static void main(String[] args) {
		
		Product041 p1 = new Product041(); 
		p1.setId(1);
		p1.setName("TV");
		p1.setPrice(4321.56);
		System.out.println("p1.id = " + p1.getId());
		System.out.println("p1.name = " + p1.getName());
		System.out.println("p1.price = " + p1.getPrice());
		System.out.println("p1: " + p1.toString());
		System.out.println(); 
		
		Product041 p2 = new Product041(); 
		p2.setId(2); 
		p2.setName("Car");
		p2.setPrice(56243.7);
		System.out.println("p2: " + p2.toString());
		System.out.println("p1 == p2? " + (p1 == p2));
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println(); 
		
		Product041 p3 = p1; 
		System.out.println("p3: " + p3.toString());
		System.out.println("p3 == p1? " + (p3 == p1));
		System.out.println("p3.equals(p1)? " + p3.equals(p1)); 
		System.out.println(); 
		
		Product041 p4 = new Product041(); 
		p4.setId(2); 
		p4.setName("Car");
		p4.setPrice(56243.7);
		System.out.println("p4: " + p4.toString());
		System.out.println("p4 == p2? " + (p4 == p2));
		System.out.println("p4.equals(p2)? " + p4.equals(p2)); 
		System.out.println(); 
		
		System.out.println("price (p1 + p2) = " + p1.sumPrice(p2)); 
		
	}

}

class Product041 {

	private int id;
	private String name;
	private double price ;
	
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String toString() {
		
		return "[PRODUCT] id("+ this.id + ") name(" + this.name + ") price(" + this.price + ")" ; 
	}
	
	public boolean equals(Product041 p) {
		if (this.id == p.id && this.name.equals(p.name) && this.price == p.price) {
			return true ;
		}
		else {
			return false ;
		}
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public double sumPrice(Product041 p) {
		
		return this.price + p.price ;
	}

}














