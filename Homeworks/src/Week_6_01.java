// 06_1. Library

public class Week_6_01 {

public static void main(String[] args) {
		
		Library061 lib = new Library061(); 
		lib.addBook("Korean Dream", "Kim", 2015);		
		lib.addBook("Our Beutiful Goals", "Lee", 2019);
		lib.addBook("My Precious Things", "Park", 2020);
		lib.addBook("Go Up to the Mountain", "Cho", 1995);
		lib.addBook("All We Have Lost in Pandemic", "Han", 1999);
		lib.addBook("For Our Best Days", "Min", 2005);		
		System.out.println(lib); 
		
		lib.deleteBook(3);	
		System.out.println("Delete 3");
		System.out.println(lib);
		
		lib.deleteBook(0);		
		System.out.println("Delete 0");
		System.out.println(lib);
		
		lib.deleteBook(2);		
		System.out.println("Delete 2");
		System.out.println(lib);
		
		lib.addBook("New World", "Son", 2012);
		System.out.println("Add <New World>");
		System.out.println(lib);

		lib.addBook("My Precious Things", "Park", 2020);
		System.out.println("Add <My Precious Things>");
		System.out.println(lib);

	}

}

class Library061 {
	public final static int MAX_BOOKS = 5; 
	private int numBooks = 0;
	private Book061[] book = new Book061[MAX_BOOKS]; 
	
	public Library061() {
		this.numBooks = 0;
		int i;
		for(i=0; i<MAX_BOOKS; i++) {
			book[i] = new Book061("","",0);
		}
	}
	
	public void addBook(String title, String author, int publishYear) {
		
		if(numBooks!=MAX_BOOKS) {
			
			int i;
			for(i=0; i<numBooks+1; i++) {
				
				if(this.book[i].getTitle().compareToIgnoreCase(title)>0 | this.book[i].getTitle().equals("")) { //들어온 제목이 더 알파벳 순으로 빠를경우
					
					Book061 temp1 = new Book061(title, author, publishYear);
					int idx = i;
					do {
							
							Book061 temp2 = new Book061(book[idx]);
						
							book[idx].setTitle(temp1.getTitle());
							book[idx].setAuthor(temp1.getAuthor());
							book[idx].setPublishYear(temp1.getPublishYear());
		
							temp1 = new Book061(temp2);
							
							idx += 1 ;
							
					} while (idx <= numBooks);
					
					break;
				}
				
			}
				
			numBooks += 1;
			
		}
	}
	
	public void deleteBook(int index) {
		
		if(index<numBooks) {
			
			int i;
			for(i=index+1; i<numBooks; i++) {
				
				book[i-1].setTitle(new String(book[i].getTitle()));
				book[i-1].setAuthor(new String(book[i].getAuthor()));
				book[i-1].setPublishYear(book[i].getPublishYear());
				
			}
		}
		
		numBooks -= 1;
	}
	
	public String toString() {
		
		String returnString = "";
		
		returnString += String.format("[LIBRARY] numBooks(%d)%n", numBooks);
			
		int i;
		for(i=0; i<numBooks; i++) {
			
			returnString += String.format("%d: [BOOK] title(%s) author(%s) year(%d)%n",i, book[i].getTitle(), book[i].getAuthor(), book[i].getPublishYear());
			
		}
		
		return returnString;
	}	
}


class Book061 {
	
	private String title;
	private String author;
	private int publishYear;
	
	
	public Book061() {
		
		title = null;
		author = null;
		publishYear = 0;
	}
	
	public Book061(Book061 book) {
		
		this.title = new String(book.getTitle());
		this.author = new String(book.getAuthor());
		this.publishYear = book.getPublishYear();
	}
		
	public Book061(String title, String author, int publishYear) {
		
		this.title = title;
		this.author = author;
		this.publishYear = publishYear;
	}
	
	public String getTitle() {
		return new String(this.title);
	}
	
	public String getAuthor() {
		return new String(this.author);
	}
	
	public int getPublishYear() {
		return this.publishYear;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
}