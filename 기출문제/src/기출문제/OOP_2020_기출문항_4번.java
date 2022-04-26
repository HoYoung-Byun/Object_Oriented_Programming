package 기출문제;

import java.util.Scanner;

public class OOP_2020_기출문항_4번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int binary = scan.nextInt();
		int number = 0;
		int base = 1;
		
		int i = 0;
		while(binary >= 1) {
			
			number += base * (binary % 10);
			binary /= 10;
			base *= 2;
			
		}
		
		System.out.println(number);
	}

}
