// 04_2. Constructors

public class Week_4_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book42 b1 = new Book42(); 
		Book42 b2 = new Book42("Flower in the wind");
		Book42 b3 = new Book42("Brave people", 342, 2013);
		
		System.out.println("b1: " + b1.toString());
		System.out.println("b2: " + b2.toString());
		System.out.println("b3: " + b3.toString());

	}

}


class Book42 {
	
	private String title ;
	private int numPage ;
	private int year ; 
	
	
	public Book42() {
		
		this.title = "no title" ;
		this.numPage = 0 ;
		this.year = 2000 ;
		
	}   // default constructor
	
	
	public Book42(String title) {
		
		this.title = title ;
		this.numPage = 0 ; // 이것과
		this.year = 2000 ; //이줄은 this(); 하나로 축약가능 (this()는 다른 생성자를 불러오는 역할)
		
	}
	
	
	public Book42(String title, int numPage, int year) {
		
		this.title = title ;
		this.numPage = numPage ;
		this.year = year ;
		
	}
	
	public String toString() {
		
		return "[BOOK] title(" + this.title + ") numPage(" +this.numPage+ ") year(" +this.year+ ")" ;
		
	}
}
