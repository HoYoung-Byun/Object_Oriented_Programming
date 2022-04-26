

//배열 Sorting

package 기출문제;

public class Sorting {

	public static void main(String[] args) {
		
		int[] array_1 = {3,7,9,1,2,3,4,10,3};
		String[] array_2 = {"this", "is", "array", "alphabet", "%%","123"};
		
		sortIntArr(array_1);
		sortStrArr(array_2);
		
		int i;
		for(i=0; i<array_1.length; i++) {
			System.out.println(array_1[i]);
		}
		
		for(i=0; i<array_2.length; i++) {
			System.out.println(array_2[i]);
		}
	}
	
	static void sortIntArr(int[] array) {
		
		int i;
		for(i=1; i<array.length; i++) {
			
			int k;
			for(k=i-1; k>-1; k--) {
				
				if(array[k]>array[k+1]) {
					int temp = array[k];
					array[k] = array[k+1];
					array[k+1] = temp;
				}
				
			}
			
			
		}
		
	}
	
	static void sortStrArr(String[] array) {
		
		int i;
		for(i=1; i<array.length; i++) {
			
			int k;
			for(k=i-1; k>-1; k--) {
				if(array[k].compareToIgnoreCase(array[k+1]) > 0) {
					
					String temp = array[k];
					array[k] = array[k+1];
					array[k+1] = temp;
					
				}
			}
			
			
		}
		
	}

}



class Arr_sort{
	
	int[] array_1 = {3,7,9,1,2,3,4,10,3};
	String[] array_2 = {"this", "is", "array", "alphabet", "%%","123"};
	
	
	public sorting() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}

class Book {
	
	private String title;
	private int page;
}