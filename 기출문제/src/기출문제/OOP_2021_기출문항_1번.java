package 기출문제;

import java.util.Scanner;

public class OOP_2021_기출문항_1번 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String sentence;
		sentence = scan.nextLine();
		
		String result = "";
		
		int i = 0;
		for(i=0; i<sentence.length(); i++) {
			
			char temp = sentence.charAt(i);
			if(temp !='A' && temp !='E' && temp !='I' && temp !='O' && temp !='U' && temp !='a' && temp !='e' && temp !='i' && temp !='o' && temp !='u') {
				result += temp;
			}
			
		}
		System.out.println(result);
		
		
		

	}

}
