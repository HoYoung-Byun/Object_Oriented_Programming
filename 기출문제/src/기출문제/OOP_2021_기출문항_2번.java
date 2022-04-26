package 기출문제;

import java.lang.reflect.Constructor;
import java.text.Format;

public class OOP_2021_기출문항_2번 {

	public static void main(String[] args) {
		
		Triple t1 = new Triple(); 
		Triple t2 = new Triple(9, 2, 3); 
		Triple t3 = new Triple(6, 12, 8); 
		
		System.out.println("t1 = " + t1); 
		System.out.println("t2 = " + t2); 
		System.out.println("t3 = " + t3); 
		System.out.println("t2 add t3 = " + t2.add(t3)); 
		System.out.println("t3 sub t2 = " + t3.sub(t2)); 
		System.out.println("t2 sub t3 = " + t2.sub(t3)); 
		System.out.println("t1 merge t2 = " + t1.merge(t2)); 
		System.out.println("t2 merge t3 = " + t2.merge(t3));
		System.out.println("t3 merge t2 = " + t3.merge(t2)); 

	}

}

class Triple{
	
	private int[] matrix = new int[3];
		
	public Triple(){
		matrix[0] = 0;
		matrix[1] = 0;
		matrix[2] = 0;
	}
	
	public Triple(int num1, int num2, int num3) {
		
		matrix[0] = num1;
		matrix[1] = num2;
		matrix[2] = num3;
		
		Triple.sortMatrix(this);
		
	}
	
	public static void sortMatrix(Triple triple) {
		
		int[] returnMatrix = triple.getMatrix();
				
		int i;
		for(i=1;i<3; i++) {

			int pivot = returnMatrix[i];
			
			int j;
			for(j=i-1; j>-1; j--) {

				if(pivot<returnMatrix[j]) {
					returnMatrix[j+1] = returnMatrix[j];
					returnMatrix[j] = pivot;
				}	
			}
		}
	}
	
	public String add(Triple matrix_add) {
		
		
		Triple add = new Triple();		
		
		add.setMartix(this.matrix[0] + matrix_add.getMatrix()[0], this.matrix[1] + matrix_add.getMatrix()[1], this.matrix[2] + matrix_add.getMatrix()[2]);
		sortMatrix(add);
		
		String returnString = String.format("[%d %d %d]",add.getMatrix()[0],add.getMatrix()[1],add.getMatrix()[2]);
		return returnString;		
		
	}
	
	public String sub(Triple matrix_sub) {
		
		Triple sub = new Triple();

		sub.setMartix(this.matrix[0] - matrix_sub.getMatrix()[0], this.matrix[1] - matrix_sub.getMatrix()[1], this.matrix[2] - matrix_sub.getMatrix()[2]);
		sortMatrix(sub);
		
		String returnString = String.format("[%d %d %d]",sub.getMatrix()[0],sub.getMatrix()[1],sub.getMatrix()[2]);
		return returnString;
		
	}
	
	public String merge(Triple matrix1) {
		
		Triple returnMatrix = new Triple();
		
		returnMatrix.matrix[2] = this.matrix[1];
		returnMatrix.matrix[0] = Triple.max(this.matrix, matrix1.matrix);
		returnMatrix.matrix[1] = Triple.min(this.matrix, matrix1.matrix);
		
		sortMatrix(returnMatrix);
		
		return returnMatrix.toString();
	}
	
	public static int max (int[] matrix1, int[] matrix2) {
		
		int max = matrix1[0];
		int i=0;
		
		for(i=1; i<matrix1.length; i++) {
			if(max < matrix1[i]) {
				max = matrix1[i];
			}
		}
		
		for(i=0; i<matrix2.length; i++) {
			if(max < matrix2[i]) {
				max = matrix2[i];
			}
		}
		
		return max;
		
	}
	
	public static int min (int[] matrix1, int[] matrix2) {
		
		int min = matrix1[0];
		int i=0;
		
		for(i=1; i<matrix1.length; i++) {
			if(min > matrix1[i]) {
				min = matrix1[i];
			}
		}
		
		for(i=0; i<matrix2.length; i++) {
			if(min > matrix2[i]) {
				min = matrix2[i];
			}
		}
		
		return min;
		
	}
	
	public int[] getMatrix() {
		
		return matrix;
	}
	
	
	
	public String toString() {
		
		String returnSentence = String.format("[%d %d %d]", matrix[0], matrix[1], matrix[2]);
		return returnSentence;
	}
	
	public void setMartix(int a, int b, int c) {
		matrix[0] = a;
		matrix[1] = b;
		matrix[2] = c;
	}
	
	public void setMatrix(int[] matrix) {
		
		this.matrix[0] = matrix[0];
		this.matrix[2] = matrix[2];
		this.matrix[1] = matrix[1];
		
	}
}










