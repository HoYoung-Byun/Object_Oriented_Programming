package 기출문제;

import java.text.Format;

public class OOP_2021_기출문항_3번 {
	
	public static void main(String[] args) {
		Process p = new Process(); 
		Process q = new Process(); 
		Process r = new Process(); 
		Process s = new Process(); 
		
		p.sendX(5);
		q.receiveX();
		r.receiveX();
		r.sendX(7);
		s.receiveX();
		p.receiveX();
		
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(s);
	}


}

class Process {
	
	private static int Digit = 0;
	private static int turn = 0;
	int x ;
	
	public void sendX(int K) {
		
		Process.Digit = K;
	}
	
	public void receiveX() {
		x = Digit;
	}
	
	public String toString() {
		
		String returnString = String.format("Process[%d] x = %d",Process.turn,x);
		Process.turn += 1;
		
		return returnString;
	}
	
	
}