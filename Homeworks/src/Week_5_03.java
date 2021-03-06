// 05_3. Deep

public class Week_5_03 {
	
	public static void main(String[] args) {
		People053 p1 = new People053("Kim", 25);
		People053 p2 = new People053("Lee", 32);
		People053 p3 = new People053("Park", 45);
		People053 p4 = new People053(p1); 
		Book053 b1 = new Book053("Book1", p1, 125); 
		Book053 b2 = new Book053("Book2", p2, 89);
		Book053 b3 = new Book053("Book3", p3, 246);
		Book053 b4 = new Book053("Book4", p4, 322);
		Book053 b5 = new Book053(b3);
		
		b5.setAuthorName("Cho");
		p2.setName("Han");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
	}

}

class Book053 {
	
	private String title;
	private People053 author;
	private int numPages;
	
	public Book053(String title, People053 P, int numPages) {
		
		this.title = title;
		this.author = new People053(P);
		this.numPages = numPages;
		
	}
	
	public Book053(Book053 B) {
		
		this.title = B.getTitle();
		this.author = B.getAuthor();
		this.numPages = B.getnumPages();
		
	}
	
	public void setAuthorName(String name) {
		this.author.setName(name);
	}
	
	public String toString() {
		return "[BOOK] title(" + title + ") author([PEOPLE]" +this.author.getName() + "(" + this.author.getAge() + ")) numPages(" + this.numPages + ")";
	}
	
	public int getnumPages() {
		return this.numPages;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public People053 getAuthor() {
		
		return new People053(this.author) ;
	}
}


class People053 {
	
	private String name;
	private int age;
	
	public People053(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public People053(People053 P) {
		
		this.name = P.getName();
		this.age = P.getAge();
			
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
		
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
	