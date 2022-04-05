// 04_3. StringTokenizer

import java.lang.reflect.Method;
import java.util.StringTokenizer;

public class Week_4_03 {
	
	public static void main(String[] args) {
		Splitter43 sp1 = new Splitter43("this/is/an/example/of/string/tokenizer", "/");
		Splitter43 sp2 = new Splitter43();
		Splitter43 sp3 = new Splitter43("Korea Seoul Busan Daegu Incheon");
		
		System.out.println("sp1 ---------------");
		sp1.split();
		System.out.println("sp2 ---------------");
		sp2.split();
		System.out.println("sp3 ---------------");
		sp3.split();

	}
}

class Splitter43 {
	
	String delimiter; //private �־����!!
	String words ; //private �־����!!
	
	public Splitter43() {
		
		this.words = "" ;
		this.delimiter = " " ; //delimeter = null; �� �մ��� �� ����
	}
	
	public Splitter43(String words, String delimiter) {
		
		this.words = words ;
		this.delimiter = delimiter ;
	}
	
	public Splitter43(String words) {
		
		this.words = words ; 
		this.delimiter = " " ; //this(); �� ��� ���� 
		
	}
	
	public void split() {
		
		StringTokenizer tokenizer = new StringTokenizer(this.words, this.delimiter) ; //�� �ڵ� ������ delimeter�� null�ΰ�찡 �߻��ϹǷ� delimeter�� null�� ��� ����ó���� �ʿ��ϴ�.
		String parseWord ;
		
		while(tokenizer.hasMoreTokens()) {
			
			parseWord = tokenizer.nextToken();
			System.out.println(parseWord);
			
		}
	}
}



