package 중간고사;

public class midterm_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BorrowBook b1 = new BorrowBook(3); 
		BorrowBook b2 = new BorrowBook(5); 
		BorrowBook b3 = new BorrowBook(6); 
		BorrowBook b4 = new BorrowBook(5);
		BorrowBook b5 = new BorrowBook(9); 
		BorrowBook b6 = new BorrowBook(3);
		
		System.out.println("How many trials? " + b1.getNumTrials());
		System.out.println("How many trials? " + BorrowBook.getNumTrials());
		System.out.println("How many available books? " + b5.getNumAvailableBooks());
		System.out.println("How many available books? " + BorrowBook.getNumAvailableBooks());

	}

}


class BorrowBook{
	
	public static boolean[] canOrNot = {true,true,true,true,true,true,true,true,true,true};
	public static int NumTrials = 0;
	public static int NumAvailableBooks = 10;
	
	public BorrowBook() {
	}
	
	public BorrowBook(int id) {
		
		if(canOrNot[id] == false) {
			System.out.printf("%d Fail%n",id);
		}
		else {
			canOrNot[id] = false;
			System.out.printf("%d Success%n",id);
			NumAvailableBooks -= 1;
		}
		
		BorrowBook.NumTrials += 1;
	}
	
	public static int getNumTrials() {
		return BorrowBook.NumTrials;
	}
	
	public static int getNumAvailableBooks() {
		return NumAvailableBooks;
	}
	
	
}