package 기출문제;

import java.util.Iterator;

public class OOP_2021_기출문항_4번 {

	public static void main(String[] args) {
		
		StudentM4 s1 = new StudentM4("Tom"); 
		System.out.println(s1); 
		
		s1.addBook("English Grammar", 352);	
		s1.addBook("My Home", 211);
		s1.addBook("English Grammar", 311);
		s1.addBook("My Home", 235);
		s1.addBook("Korean Dream", 178);
		s1.addBook("Allow me", 876);
		System.out.println(s1); 
		
		s1.deleteBook("English Grammar");
		System.out.println(s1); 
		
		s1.addBook("Save me", 876);
		System.out.println(s1); 
		
		StudentM4 s2 = new StudentM4("Jane");
		s2.addBook("Climate Crisis", 125);
		s2.addBook("My Home", 211);
		s2.addBook("Save me", 555);
		System.out.println(s2); 
		
		s1.takeBooks(s2);
		System.out.println(s1);

	}

}

class StudentM4{
	
	private String name;
	private BookM4[] library = new BookM4[5];
	private int NumberOfBooks;
	
	public BookM4[] getLibrary() {
			
		return library;
	}
	
	
	public int getNumberOfBooks() {
		return NumberOfBooks;
	}
	
	public StudentM4() {
		
		name = "no name";
		NumberOfBooks = 0;
		int i = 0;
		for(i=0; i<library.length; i++) {		
			library[i] = new BookM4();
		}
	}
	
	public StudentM4(String name) {
		this.name = name;
		NumberOfBooks = 0;
		int i = 0;
		for(i=0; i<library.length; i++) {		
			library[i] = new BookM4();
		}
	}
	
	public void deleteBook(String title) {
		
		int i;
		for(i=0; i<NumberOfBooks; i++) {
			if(library[i].getTitle().equals(title)) {
				int k;
				for(k=i; k<NumberOfBooks-1; k++) {
					
					library[k] = new BookM4(library[k+1]); //new해야함!!!!!   privacy leak 주의!!!!!!!!!!!!!!!!
					
				}
				library[NumberOfBooks-1].setPage(0);
				library[NumberOfBooks-1].setTitle("no name");
				
				NumberOfBooks--;
				break;
			}
		}
		
	}
	
	public void takeBooks(StudentM4 s) {
		
		int i;
		for(i=0; i<s.getNumberOfBooks(); i++) {
			this.addBook(s.getLibrary()[i].getTitle(), s.getLibrary()[i].getPage());
		}
		
	}
	
	public void addBook(String title, int page) {
		
		if(NumberOfBooks < 5) {
			library[NumberOfBooks].setPage(page);
			library[NumberOfBooks].setTitle(title);
			NumberOfBooks++;
			this.sort();
		}
		else {
			
			int i;
			int confirm = 0;
			for(i=0; i<NumberOfBooks; i++) {
				if(library[i].getTitle().compareTo(title)>0 || (library[i].getTitle().compareTo(title)==0 && library[i].getPage()<page)) {
					confirm = 1;
				}
			}
			if(confirm == 1) {
				library[NumberOfBooks-1].setPage(page);
				library[NumberOfBooks-1].setTitle(title);
				this.sort();
			}
		}
	}
	
	public void sort() { //제목 기준으로 알파벳 순 sorting!! 따로 만드는 것이 좋을 것 같다.
		
		int i;
		for(i=1; i<NumberOfBooks; i++) {
			
			int k;
			for(k=i-1; k>-1; k--) {
				if(library[k].getTitle().compareTo(library[k+1].getTitle())>0 || (library[k].getTitle().compareTo(library[k+1].getTitle())==0 && library[k].getPage()>library[k+1].getPage())) {
					
					BookM4 temp = new BookM4();
					temp = library[k];
					library[k]= library[k+1];
					library[k+1]=temp;
					
				}
			}
		}
	}
	
	
	
	public String toString() {
		
		String returnString = String.format("[STUDENT] name(%s) %d%n", name,NumberOfBooks);
		int i;
		for(i=0; i<NumberOfBooks; i++) {
			returnString += String.format(" %d: [BOOK] title(%s) page(%d)%n",i,library[i].getTitle(),library[i].getPage());
		}
		return returnString;
		
	}
}


class BookM4{
	
	private String title;
	private int page;
	
	public BookM4() {
		title = "no name";
		page = 0;
	}
	
	public BookM4(String title, int page) {
		this.title = title;
		this.page = page;
	}
	
	public BookM4(BookM4 book) {
		this.title = book.getTitle();
		this.page = book.getPage();
	}
	
	
	public void setTitle(String name) {
		this.title = name;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	
	public int getPage() {
		return page;
	}
	
	public String getTitle() {
		return title;
	}	
}






























//class StudentM4{
//	
//	private BookM4[] library = new BookM4[5];
//	private int numOfBooks;
//	private String name ;
//	
//	public StudentM4() {
//		name = "no name";
//		numOfBooks = 0;
//		int i = 0;
//		for(i=0; i<library.length; i++) {		
//			library[i] = new BookM4();
//		}
//	}
//	
//	public StudentM4(String name) {
//		this.name = name;
//		this.numOfBooks = 0;
//		int i = 0;
//		for(i=0; i<library.length; i++) {		
//			library[i] = new BookM4();
//		}
//	}
//	
//	
//	public void addBook(String title, int page) {
//		
//		BookM4 add = new BookM4(title, page);
//		
//		if(numOfBooks<5) {
//			
//			library[numOfBooks] = add;
//			this.sortLibrary();
//			numOfBooks += 1;
//		}
//		
//		else {
//			int checking = this.checking(add);
//			if(checking == 1) {
//				
//				library[4] = add;
//				this.sortLibrary();
//			}
//		}
//	}
//	
//	public void deleteBook(String title) {
//		
//		int i;
//		for(i=0; i<numOfBooks; i++) {
//			
//			if(library[i].getTitle().equals(title)) {
//				
//				int k;
//				for(k=i+1; k<numOfBooks; k++) {
//					library[k-1] = library[k];
//				}
//				
//				library[numOfBooks-1].setPage(0);
//				library[numOfBooks-1].setTitle("no title");
//				
//				numOfBooks--;
//				
//			}
//			
//		}
//		
//	}
//	
//	
//	public int checking(BookM4 add) {
//		
//		int checking = 0;
//		int i;
//		for(i=0; i<numOfBooks; i++) {
//			
//			if(add.getTitle().compareToIgnoreCase(library[i].getTitle())<0) {
//				checking = 1;
//			}
//			else if(add.getTitle().compareToIgnoreCase(library[i].getTitle())==0 && add.getPage()<library[i].getPage()) {
//				checking = 1;
//			}
//		}
//		
//		return checking;
//	}
//	
//	
//	
//	public void sortLibrary() {
//		int i;
//		if(numOfBooks>1) {
//			BookM4 pivot = new BookM4(library[numOfBooks-1]);
//			for(i=numOfBooks-1 ; i>-1; i--) {
//				
//				if(pivot.getTitle().compareToIgnoreCase(library[i].getTitle())<0) {
//					
//					library[i+1] = new BookM4(library[i]);
//					library[i] = pivot;
//				}
//				
//				if(pivot.getTitle().compareToIgnoreCase(library[i].getTitle()) == 0 && pivot.getPage()<library[i].getPage()) {
//					
//					library[i+1] = new BookM4(library[i]);
//					library[i] = pivot;
//				}
//				
//			}
//			
//		}
//		
//	}
//	
//	
//		
//	
//	
//	public String toString() {
//		
//		String returnString = String.format("[STUDENT] name(%s) %d%n", name,numOfBooks);
//		int i;
//		for(i=0; i<numOfBooks; i++) {
//			returnString += String.format(" %d: [BOOK] title(%s) page(%d)%n",i,library[i].getTitle(),library[i].getPage());
//		}
//		return returnString;
//		
//	}
//	
//}
//
//
//
//class BookM4 {
//	
//	private String title;
//	private int page;
//	
//	public BookM4() {
//		title = "no title";
//		page = 0;
//	}
//	
//	public BookM4(String title, int page) {
//		this.title = title;
//		this.page = page;
//	}
//	
//	public BookM4(BookM4 book) {
//		this.title = book.title;
//		this.page = book.page;
//	}
//	
//	
//	public int getPage() {
//		return page;
//	}
//	
//	public String getTitle() {
//		return title;
//	}
//	
//	public void setPage(int page) {
//		this.page = page;
//	}
//	
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	
//}
//
//
//
//
//
//
//
//






