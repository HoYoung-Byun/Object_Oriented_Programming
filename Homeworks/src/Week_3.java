import java.util.Iterator;
import java.util.Scanner;

public class Week_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 03_1. reverse
		/*
		Scanner scan = new Scanner (System.in) ;
		
		int num = scan.nextInt();
		String numString = Integer.toString(num) ;
		
		int i ;
		for(i = 0; i < numString.length() ;  i++) {
			
			char letter = numString.charAt(numString.length()-i-1) ;
			System.out.print(letter);
			
		}
		
		scan.close();
		*/

		
		
		// 03_2. Counting A
		/*
		Scanner scan = new Scanner (System.in) ;
		
		String sentence = scan.nextLine() ;
		
		int i , numOfa = 0;
		
		
		for(i = 0; i < sentence.length(); i++ ) {
			char letter_char = sentence.charAt(i);
			String letter_String = Character.toString(letter_char);
			
			if (letter_String.equals("a")) {
				numOfa += 1 ;
			}
				
		}
		
		System.out.println(numOfa);
		scan.close();
		*/
		
		
		
		// 03_3. Rectangle System
		
		Scanner scan = new Scanner (System.in) ;
		
		int x1 = 0, y1 = 0 ;
		int x2 = 5, y2 = 5 ;
		
		
		while(true) {
			
			System.out.printf("(%d,%d) (%d,%d)%n",x1,y1,x2,y2);
			
			String key = scan.nextLine();
			
			if (key.equals("area")) {
				
				int valueOfArea = Math.abs(y2-y1) * Math.abs(x2-x1);
				System.out.println("area = " + valueOfArea);
				
			}
			
			else if (key.equals("center")) {
				
				
				double x_center = ((double)x1 + x2)/2 ;
				double y_center = ((double)y1 + y2)/2 ;
				System.out.printf("center = (%.1f,%.1f)%n", x_center, y_center);
				
			}
			
			
			else if (key.equals("exit")) {
				System.out.println("bye");
				break;
			}
			
			else {
				
				String coordination_name = key.substring(0, 2);
				String coordinationNum_inString = key.substring(3) ;
				int coordinationNum_inInteger = Integer.parseInt(coordinationNum_inString);
				
				if (coordination_name.equals("x1")) {
					x1 = coordinationNum_inInteger ;
				}
				
				else if (coordination_name.equals("x2")) {
					x2 = coordinationNum_inInteger ;
				}
				
				else if (coordination_name.equals("y1")) {
					y1 = coordinationNum_inInteger ;
				}
				
				else if (coordination_name.equals("y2")) {
					y2 = coordinationNum_inInteger ;
				}
				
			}
		}

		scan.close();
	}
}




























