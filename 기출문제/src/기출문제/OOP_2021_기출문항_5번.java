package 기출문제;

import java.lang.Math;

public class OOP_2021_기출문항_5번 {

	public static void main(String[] args) {
		int[][] a = {{1, 1, 1}, {2, 2}, {3, 3, 3, 3}}; 
		int[][] b = {{4}, {5, 5, 5}, {6, 6}, {7, 7, 7}}; 
		
		show(a);
		System.out.println(); 
		show(b);
		System.out.println(); 
		
		int[][] c = add(a, b); 
		show(c); 
		System.out.println(); 
		
		int[][] d = merge(a, b); 
		show(d); 
		System.out.println(); 
		
		int[][] e = merge(b, a); 
		show(e); 
	}
	
	static void show(int[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j]);
				if (j != x[i].length - 1)
					System.out.print(" ");
			}
			System.out.println(); 
		}
	}
	
	// your code for add and merge here
	static int[][] add(int[][] a, int[][] b) {
		
		
		int[][] returnArr = new int[][] 
		for()
	}
	
	
}

class calculator{
	
	public int max(int[] a,int[] b) {
		
		if(a.length < b.length) {
			
			return b.length;
		} else {
			return a.length;
		}

	}
	
	public int min(int[] a,int[] b) {
		
		if(a.length < b.length) {
			
			return a.length;
		} else {
			return b.length;
		}

	}
	
}
