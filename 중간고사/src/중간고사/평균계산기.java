package 중간고사;

import java.util.Scanner;

public class 평균계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	
		int i=0;
		while(i<=6) {
			i++;
			System.out.println("");
			int total = scan.nextInt();
			float rate = scan.nextFloat();
			 
			
			System.out.printf("total: %d, rate: %.2f, correct people: %.1f%n", total, rate, total*rate/100);
		}
		
		
		
	}

}

