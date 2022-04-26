package 기출문제;

import java.util.Scanner;

public class OOP_2020_기출문항_3번 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String sentence = scan.nextLine();
		
		int i;
		boolean result = true;
		for(i=0; i<sentence.length(); i++) {
			
			if(Character.isDigit(sentence.charAt(i))) {
				continue;
			}
			else if (sentence.charAt(i) == ' ') {
				continue;
			}
			else {
				result = false;
				break;
			}
		}
		
		System.out.println(result);

	}
}
