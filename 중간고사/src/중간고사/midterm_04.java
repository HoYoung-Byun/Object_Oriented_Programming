package 중간고사;

public class midterm_04 {

	public static void main(String[] args) {
		int[][] m1Data = {{1, 2, 3}, {4}, {5, 6}}; 
		int[][] m2Data = {{7, 8}, {9, 10, 11}, {12}}; 
		Number[][] m1 = new Number[3][3];
		Number[][] m2 = new Number[3][3]; 
		
		fillData(m1, m1Data); 
		fillData(m2, m2Data); 
		showNumberMatrix(m1);
		System.out.println();
		showNumberMatrix(m2); 
		System.out.println(); 
		
		Number[][] m3 = addNumberMatrix(m1, m2); 
		showNumberMatrix(m3); 
	}
	
	// your code for fillData, showNumberMatrix, addNumberMatrix here
	
	static void fillData(Number[][] num, int[][] data){
		
		int i,k;
		for(i=0; i<num.length; i++) {
			for(k=0; k<num[i].length; k++) {
				num[i][k] = new Number(0);
			}
		}
		
		for(i=0; i<data.length; i++) {
			for(k=0; k<data[i].length; k++) {
				
				num[i][k] = new Number(data[i][k]);
			}
		}
		
	}
	
	static void showNumberMatrix(Number[][] num){
		
		int i,k;
		String returnString ="";
		for(i=0; i<3; i++) {
			for(k=0;k<3; k++) {
				
				returnString += num[i][k].getNumber() + " ";
				
			}
			returnString = returnString.trim();
			System.out.println(returnString);
			returnString = "";
		}

	}
	
	static Number[][] addNumberMatrix(Number[][] num1, Number[][] num2){
		
		Number[][] m = new Number[3][3];
		
		int i,k;
		for(i=0; i<3; i++) {
			for(k=0;k<3; k++) {
				
				m[i][k] = new Number(num1[i][k].getNumber()+num2[i][k].getNumber());
				
			}
		}

		return m;
	}
	
}

// your code for class Number 
class Number{
	
	private int n;
	
	public Number() {
		n = 0;
	}
	
	public Number(int number) {
		n = number;
	}
	
	public int getNumber() {
		return n;
	}
	
	public void setNumber(int n) {
		this.n = n;
	}
}