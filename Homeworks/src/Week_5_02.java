// 05_2. Wrapper, Character, Math - 상당히 어려웠다.. 2번 풀이에서는 예외처리를 위한 try-catch를 사용함

import java.util.regex.Pattern;
import java.util.Scanner; 
import java.util.StringTokenizer;


public class Week_5_02 {

	public static void main(String[] args) {
		
		double mean = compute();
		System.out.println(mean);
		
	}
	
	static double compute(){
		
		double sum = 0.0;
		double numOfNumber = 0.0;
		double mean;
		String word;
		
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		StringTokenizer tokenizer = new StringTokenizer(sentence);
		
		if(tokenizer.hasMoreTokens()) {
			
			while(tokenizer.hasMoreTokens()) {
			
				word = tokenizer.nextToken();
				double numOfDot = 0.0;
				double numOfplusMinus=0.0;
				double breakSignal = 0.0;
				
				
				int i;
				for(i=0; i<word.length(); i++) {
					
					
					if(Character.isDigit(word.charAt(i))){
						continue;
					}
					
					else if (word.charAt(i) == '.') {
						numOfDot++;
					}
					else if(word.charAt(i)=='+'|| word.charAt(i)=='-') {
						numOfplusMinus++;
					}
					else {
						breakSignal = 1.0;
						break;
					}
				}
				
				
				if(breakSignal == 0.0 && numOfDot<=1.0 && numOfplusMinus<=1.0 ) {
					sum += Double.parseDouble(word); 
					numOfNumber++;
				} else { continue; }
			}
			
			if (numOfNumber == 0) {
				mean = 0.0;
			} else {
				mean = sum/numOfNumber;
			}
			
			return mean;
			
		}else {
			
			mean = 0.0;
			return mean;
		}
	}
	
	
	/*
	//try-catch 이용한 풀이
	static double compute() {
		
		double sum = 0.0;
		double numOfNumber = 0.0;
		double mean = 0.0;
		String word;
		
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		StringTokenizer tokenizer = new StringTokenizer(sentence);
		
		while(tokenizer.hasMoreTokens()) {
			
			
			try {
				
				word = tokenizer.nextToken();
				sum += Double.parseDouble(word);
				numOfNumber += 1;
				
			}
			
			catch (NumberFormatException e) {
				continue;
			}
			
			finally { mean = sum / numOfNumber; }	
		}
		
		if(numOfNumber == 0) {
			mean = 0.0;
		}
		return mean;
	}
	*/
	
	
	/*
	static double compute() {
		
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		int numOfDot = 0;
		int breakpoint = 0;
		double sum = 0;
		int numberOfNum = 0;
		
		StringTokenizer tokenizer = new StringTokenizer(sentence);
		
		while(tokenizer.hasMoreTokens()) {
			
			breakpoint = 0;
			Character temp ;
			String word = tokenizer.nextToken();
			
			int i = 0 ;
			
			
			for (i=0; i < word.length(); i++) {
				
				
				temp = word.charAt(i);
				
				if (i==0) {
					if (word.charAt(i)=='+'||word.charAt(i)=='-') {
						continue;
					}
					else if (word.charAt(i)=='.') {
						numOfDot++;
					}
					else if(Character.isDigit(temp)) {
						continue;
					}
					else {
						breakpoint = 1;
						break;
					}
				}
				
				else {
					if (temp == '.') {
						numOfDot++;
					}
					
					else if(Character.isDigit(temp)) {
						continue;
					}
					else {
						breakpoint = 1;
						break;
					}
				}
			}
			
			if (breakpoint == 1) {
				continue;
			}
			else {
				if (numOfDot <=1){
					System.out.println(word);
					sum += Double.parseDouble(word);
					numberOfNum++;
				}
			}
			
			numOfDot = 0;
		}
		
		return sum/numberOfNum ;
	}
	/*
	
	
	
	
	
	
	/*
	static double compute() {
		
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		StringTokenizer tokenizer = new StringTokenizer(sentence);
		int numberOfNumbers = 0;
		double sumOfNumbers = 0;
		
		while(tokenizer.hasMoreTokens()) {
			
			String word = tokenizer.nextToken();
			
			
			
			if (Pattern.matches("[+][0-9]+.[0-9]+|[+][0-9]+|[-][0-9]+.[0-9]+|[-][0-9]+|[0-9]*.?[0-9]+", word)) {
				
				numberOfNumbers++;
				sumOfNumbers += Double.parseDouble(word);
				System.out.println(word);
			}		
		}
		
		scan.close();
		
		return sumOfNumbers/numberOfNumbers;
	}
	*/
}

