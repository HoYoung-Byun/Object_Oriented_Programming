package ���⹮��;

import java.util.Scanner;

public class OOP_2020_���⹮��_2�� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int integer = scan.nextInt();
		
		int i,k;
		int j = 1;
		for(i=0; i<integer; i++) {
			
			for(k=0; k<i+1; k++) {
				System.out.printf("%d ",j);
				j++;
			}
			System.out.println("");
		}
		
		

	}

}
