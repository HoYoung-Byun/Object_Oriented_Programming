package 기출문제;

public class 실험실 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		sortLibrary(null, 0);

	}
	
	static void sortLibrary(BookM4[] library, int numOfBooks) {
		int i;
		
		BookM4 pivot = new BookM4(library[numOfBooks]);
		for(i=numOfBooks-1 ; i>-1; i--) {
			
			if(pivot.getTitle().compareToIgnoreCase(library[i].getTitle())<0) {
				
				library[i+1] = new BookM4(library[i]);
				library[i] = pivot;
			}
			
			if(pivot.getTitle().compareToIgnoreCase(library[i].getTitle()) == 0 && pivot.getPage()<library[i].getPage()) {
				
				library[i+1] = new BookM4(library[i]);
				library[i] = pivot;
			}
			
		}
	}

}


