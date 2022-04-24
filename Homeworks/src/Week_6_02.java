
public class Week_6_02 {

	public static void main(String[] args) {
		int a[] = { 3, 9, 2, 5, 11, 6, 1, -3 };
		int b[] = { 8, -4, 10, 3, 8, 2, 12, 4 }; 
		printArray(a, "a"); 
		printArray(b, "b");
		int c[] = merge(a, b); 
		printArray(c, "c"); 
	}
	
	static void printArray(int[] a, String title) {
		
		System.out.printf("%s = [",title);
		
		int i;
		String lstContent = "";
		for (i = 0; i<a.length; i++) {
			
			lstContent += a[i] + " ";
			
		}
		lstContent = lstContent.trim();
		System.out.println(lstContent + "]");
	}
	
	static int[] merge(int[] a, int[] b) {
		
		int[] c = new int[ a.length + b.length ];
		
		int i = 0, j = 0;
		
		
		while(i<a.length | j<b.length) {

			if(i == a.length) {
				
				c[i+j] = b[j];
				j += 1;
				continue;
			}
			else if (j == b.length) {
				
				c[i+j] = a[i];
				i += 1;
				continue;
			}
			else {
				
				int tempA = a[i];
				int tempB = b[j];
				
				if(tempA <= tempB) {
					c[i+j] = tempA;
					i += 1;
				}
				
				else {
					c[i+j] = tempB;
					j += 1;
				}
			}
				
		}
		
		return c;
	}

}
