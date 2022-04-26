package 중간고사;

public class midterm_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p1 = new Parent(); 
		Parent p2 = new Parent(3);
		Parent p3 = new Parent(3); 
		Child c1 = new Child(); 
		Child c2 = new Child(5); 
		Child c3 = new Child(7, 8); 
		Child c4 = new Child(7, 8); 
		
		System.out.println("p1 = " + p1); 
		System.out.println("p2 = " + p2); 
		System.out.println("c1 = " + c1); 
		System.out.println("c2 = " + c2); 
		System.out.println("c3 = " + c3); 
		
		System.out.println("p2.data() = " + p2.data());
		System.out.println("c3.data() = " + c3.data()); 
		System.out.println("p2.compute(5) = " + p2.compute(5)); 
		System.out.println("c3.compute(2, 3) = " + c3.compute(2, 3)); 
		
		System.out.println("p2 == p3 ? " + p2.equals(p3)); 
		System.out.println("p1 == p2 ? " + p1.equals(p2)); 
		System.out.println("p2 == c2 ? " + p2.equals(c2)); 
		System.out.println("c2 == c3 ? " + c2.equals(c3)); 
		System.out.println("c3 == c4 ? " + c3.equals(c4)); 
		System.out.println("c3 == p3 ? " + c3.equals(p3)); 
	}

}

class Parent{
	protected int x;
	
	public Parent() {
		x = 1;
	}
	
	public Parent(int x) {
		this.x = x;
	}
	
	public int data() {
		return x;
	}
	
	public int compute(int dx) {
		return dx * x;
	}
	
	public String toString() {
		return "x(" + x + ")";
	}
	
	
	public boolean equals(Object object) {
		
		if(object == null) {
			return false;
		}
		
		else if (this.getClass()!=object.getClass()) {
			return false;
		}
		
		else {
			Parent newParent = (Parent)object; 
			return (newParent.x == this.x);
		}	
	}
}

class Child extends Parent{
	
	protected int y;
	
	public Child() {
		
		super();
		y = 2;
		
	}
	
	public int compute(int dx, int dy) {
		return dx * x + dy * y;
	}
	
	public int getY() {
		return y;
	}
	
	public Child(int y) {
		super();
		this.y =y;
	}
	
	public Child(int x, int y) {
		super(x);
		this.y =y;
	}
	
	public String toString() {
		
		String returnString = String.format("x(%d) y(%d)",x,y);
		return returnString;
	}
	
	public int data() {
		return x+y;
	}
	
	public boolean equals(Object object) {
		
		if(object == null) {
			return false;
		}
		
		else if (this.getClass()!=object.getClass()) {
			return false;
		}
		
		else {
			Child newChild = (Child)object; 
			return (super.equals(newChild) && newChild.getY()==y);
		}	
	}
	
	
}









