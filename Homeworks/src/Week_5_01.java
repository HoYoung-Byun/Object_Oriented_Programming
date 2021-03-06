// 05_1. Static - 난이도 어려움


public class Week_5_01 {

	public static void main(String[] args) {
		
		Process051 p0 = new Process051(0);
		Process051 p1 = new Process051(1); 
		Process051 p2 = new Process051(2); 
		
		Service051 service1 = new Service051(3, 0); 
		System.out.println(service1);
		System.out.println(); 
		
		Service051 service2 = new Service051(p1); 
		System.out.println(service2);
		System.out.println(); 
		
		Service051 service3 = new Service051(p0);
		System.out.println(service3);
		System.out.println(); 
		
		Service051 service4 = new Service051(p2); 
		System.out.println(service4);
		System.out.println(); 
		
		Service051 service5 = new Service051(p1); 
		System.out.println(service5);
		System.out.println(); 
		
		Service051 service6 = new Service051(p2); 
		System.out.println(service6);
		System.out.println(); 
		
		Service051 service7 = new Service051(p1); 
		System.out.println(service7);   
		System.out.println(); 
		
		Service051 service8 = new Service051(p0); 
		System.out.println(service8);


	}

}

class Process051 {
	
	private int id ;
	
	public Process051(int id) { this.id = id; }
	
	public int getId() { return this.id; }
	
	
}

class Service051 {
	
	private static int numProcess;
	private static int numAccess;
	private static int turn;
	
	
	
	public Service051(int numProcess, int turn){
		Service051.numProcess = numProcess;
		Service051.turn = turn;
	}
	
	public Service051 (Process051 p) {
		
		Service051.numAccess++ ;
		
		if (p.getId() == Service051.turn) {
			
			if (p.getId() < (Service051.numProcess - 1)) {
				Service051.turn++ ;
			}
			
			else if (p.getId() == (Service051.numProcess - 1)) {
				Service051.turn = 0 ;
			}
			
			System.out.println("process p(" + p.getId() + ") done");
			
		}
		else {
			System.out.println("invalid turn for process p(" + p.getId() + ")");
		}
		
	}
	
	public String toString() {
		
		return "[SERVICE] numProcess(" + Service051.numProcess + ") numAccess("+ Service051.numAccess +") turn(" + Service051.turn + ")";
	}
	
	public static int getTurn() {
		
		return turn;
	}
	
	
}

































