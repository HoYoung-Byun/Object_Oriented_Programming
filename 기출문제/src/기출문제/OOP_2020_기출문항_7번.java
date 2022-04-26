
package 기출문제;

public class OOP_2020_기출문항_7번 {
	
	public static void main(String[] args) {
		
		Member[] ma = new Member[15]; 
		
		ma[0] = new Member("Boris"); 
		ma[1] = new Member("Tom"); 
		ma[2] = new Member("Jane", 3); 
		ma[3] = new Member("Garry"); 
		ma[4] = new Member("Kay", 5); 
		ma[5] = new Member("Harry"); 
		ma[6] = new Member("Brown"); 
		ma[7] = new Member("Kim", 4); 
		ma[8] = new Member(); 
		ma[9] = new Member("Park", 3); 
		ma[10] = new Member(); 
		ma[11] = new Member(); 
		ma[12] = new Member("Lim", 7);
		ma[13] = new Member("Gil"); 
		ma[14] = new Member(); 
		
		for (int i = 0; i < ma.length; i++) {
			System.out.println(ma[i]); 
		}
	}

}

class Member{
	
	private String name;
	private int id = -1;
	private static int[] id_useage = {0,1,2,3,4,5,6,7,8,9};
	
	
	public Member() {
		name = "noname";
		int i; 
		id = -1;

			
		for(i=0; i<id_useage.length; i++) {
			if(id_useage[i] != -1) {
				id = id_useage[i];
				id_useage[i] = -1;
				break;
			}
		}
	}
	
	public Member(String name) {
		
		this.name = name;
		int i; 
		id = -1;
		for(i=0; i<id_useage.length; i++) {
			if(id_useage[i] != -1) {
				id = id_useage[i];
				id_useage[i] = -1;
				break;
			}
		}
	}
	
	public Member(String name, int id) {
		this.name = name;
		this.id = -1;
		
		if(id_useage[id] != -1) {
			this.id = id_useage[id];
			id_useage[id] = -1;
		}
		
	}
	
	public String toString() {
		return name + " " + id;
	}
	
}