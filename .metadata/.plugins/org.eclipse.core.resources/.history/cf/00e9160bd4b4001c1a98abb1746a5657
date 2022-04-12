
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
	
	
}

class Service051 {
	
	private int numProcess;
	private int numAccess;
	private int turn;
	
	
	public Service051 (Process051 p) {
		
		
		
	}
	
	public Service051(int numProcess, int turn){
		this.numProcess = numProcess;
		this.turn = turn;
	}
	
	public String toString() {
		
		return "[SERVICE] numProcess(" + numProcess + ") numAccess("+ numAccess +") turn(" + turn + ")";
	}
	
}

































