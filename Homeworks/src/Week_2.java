import java.util.Scanner;

public class Week_2 {

	public static void main(String[] args) {
		
		// 02_1. Money
		/*
		Scanner scan = new Scanner(System.in) ;
		
		int money = scan.nextInt() ;
		int forCalculation = money ;
		
		int _50000, _10000, _5000, _1000, _500, _100, _50, _10 ;
		
		_50000 = money / 50000 ;
		forCalculation -= 50000 * _50000 ;
		
		_10000 = forCalculation / 10000 ;
		forCalculation -= 10000 * _10000 ;
		
		_5000 = forCalculation / 5000 ;
		forCalculation -= 5000 * _5000 ;
		
		_1000 = forCalculation / 1000 ;
		forCalculation -= 1000 * _1000 ;
		
		_500 = forCalculation / 500 ;
		forCalculation -= 500 * _500 ;
		
		_100 = forCalculation / 100 ;
		forCalculation -= 100 * _100 ;
		
		_50 = forCalculation / 50 ;
		forCalculation -= 50 * _50 ;
		
		_10 = forCalculation / 10 ;
		forCalculation -= 10 * _10 ;
		
		System.out.printf("%d %d %d %d %d %d %d %d", _50000, _10000, _5000, _1000, _500, _100, _50, _10);
		scan.close();
		*/
		
		
		// 02_2. Age and Name
		/*
		Scanner scan = new Scanner(System.in) ;
		
		int age = scan.nextInt();
		String junk = scan.nextLine();
		String sentence = scan.nextLine();
		
		System.out.printf("AGE(%d) NAME(%s)", age, sentence);
		*/
		
		
		// 02_3. Delete a Word
		
		Scanner scan = new Scanner(System.in) ;
		
		String sentence = scan.nextLine() ;
		String word = scan.next() ;		
		
		int frontPosition = sentence.indexOf(word);
		int lastPosition = frontPosition + word.length() - 1 ;
		int stopPosition = frontPosition - 1 ;
		int restartPosition = lastPosition + 1 ;
		
		
		String leftnewSentence = sentence.substring(0, stopPosition); 
		String rightnewSentence = sentence.substring(restartPosition) ;
				
		System.out.println(leftnewSentence + rightnewSentence);

		scan.close();
	}
	
}
