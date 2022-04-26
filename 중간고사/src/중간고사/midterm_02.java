package 중간고사;

import java.util.Scanner;
import java.util.StringTokenizer;

public class midterm_02 {
	
	public static void main(String[] args) {
    	// your code here
		
		Scanner scan = new Scanner(System.in);
		
		
		int result=0;
		while(true) {
			
			System.out.printf("result=%d%n",result);
			int numOfOperand = 0;
			int[] operands = new int[3];
			String operator = "";
			int check_operator=0;
			
			String sentence = scan.nextLine();
			StringTokenizer tokenizer = new StringTokenizer(sentence);
			
			while(tokenizer.hasMoreTokens()) {
				
				if(check_operator == 0) {
					operator = tokenizer.nextToken();
					check_operator +=1;
				}
				
				else {
					
					operands[numOfOperand] = Integer.parseInt(tokenizer.nextToken());
					numOfOperand += 1;
				}
			}
			
			
			if(operator.equals("add")) {
				
				int i;
				for(i=0; i<numOfOperand; i++) {
					
					result += operands[i];
				}
			}
			
			
			else if (operator.equals("sub")) {
				int i;
				for(i=0; i<numOfOperand; i++) {
					
					result -= operands[i];
				}
			}
			
			else if(operator.equals("mult")){
				
				int i;
				for(i=0; i<numOfOperand; i++) {
					
					result *= operands[i];
				}
			}
			else if(operator.equals("exit")) {
				
				System.out.println("bye");
				break;
			}
			
			else {
				System.out.printf("wrong operation: %s%n",operator);
				continue;
			}
			
		}
			
	}
}
