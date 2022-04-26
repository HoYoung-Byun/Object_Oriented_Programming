package 중간고사;

import java.util.StringTokenizer;

public class midterm_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Seoul is a largest city in Korea";
		String str2 = "All my dreams will come true ?boy";
		String str3 = "Hi";
		String str4 = "";
		String str5 = "That is your 123th visit in Busan.";
		
		String[] strs = {str1, str2, str3, str4, str5};
		
		for (int i = 0; i < strs.length; i++) {
			String str = strs[i];
          	
			// your code here
			
			String[] word_list = new String[10];
			StringTokenizer toknizer = new StringTokenizer(str);
			int wordNumber = 0;
			int l=0;
			while(toknizer.hasMoreElements()) {

				word_list[l] = toknizer.nextToken();
				wordNumber += 1;
				l++;
				
			}
	
			
			int k;
			for(k=1; k<wordNumber; k++) {
				
				int j;
				for(j=k-1; j>-1; j--) {
					
					if(word_list[j].compareToIgnoreCase(word_list[j+1])>0) {
						
						String temp = word_list[j];
						word_list[j] = word_list[j+1];
						word_list[j+1] = temp;	
					}
				}
			}
			
			String ab="";
			for(k=0; k<wordNumber;k++) {
				
				ab += String.format("%s ",word_list[k]);
			}
			
			ab = ab.trim();
			System.out.printf(ab);
			System.out.println();
		}
	}
}
