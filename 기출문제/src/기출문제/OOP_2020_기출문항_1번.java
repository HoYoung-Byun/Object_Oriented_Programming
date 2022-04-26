package 기출문제;

import java.util.Scanner;

public class OOP_2020_기출문항_1번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		String s1, s2, s3; 
		
		s1 = "Jenny"; 
		s2 = keyboard.next(); 
		s3 = new String("Jenny"); 
		
		System.out.println(s1 == s2);      // comparing s1 and s2
		System.out.println(s1.equals(s2));      // comparing s1 and s2    
		System.out.println(s1 == s3);      // comparing s1 and s3
		System.out.println(s2 == s3);      // comparing s2 and s3
		System.out.println(s2.equals(s3));      // comparing s2 and s3 
	}

}
