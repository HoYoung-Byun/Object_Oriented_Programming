package 기출문제;

public class OOP_2020_기출문항_8번 {

	public static void main(String[] args) {
		
		int num[] = {3, 12, 0, -2, 9}; 
		int denom[] = {5, 7, 1, 1, 15}; 
		Fraction[] a = createFractionArray(num, denom);  
		
		showFractionArray("a", a); 
		System.out.println(); 
		
		a[2].setNumDenom(3, 1); 
		a[1] = new Fraction(a[3]); 
		showFractionArray("a", a); 
		System.out.println("a[3] compareTo a[4] = " + a[3].compareTo(a[4]));
		System.out.println("a[2] compareTo a[4] = " + a[2].compareTo(a[4])); 
		Fraction k = new Fraction(-2,1);
		System.out.println("-2/1 compareTo a[3] = " + k.compareTo(a[3])); 
		System.out.println("a[0] equals a[4]? " + a[0].equals(a[4]));
		System.out.println(); 
		
		System.out.println("after sorting...");
		SortFraction.sort(a);
		showFractionArray("a", a); 
		
		System.out.println(); 
		
		int[] numB = {0};
		int[] denomB = {1};
		Fraction[] b = createFractionArray(numB, denomB);
		
		showFractionArray("b", b); 
		SortFraction.sort(b);
		System.out.println("after sorting...");
		showFractionArray("b", b); 
	}
	
	static void showFractionArray(String word, Fraction[] a) {
		
		String sentence = "";
		int i;
		for(i=0; i<a.length; i++) {
			sentence += String.format("%s[%d]=%d/%d ",word, i, a[i].getNumerator(), a[i].getDenominator());
		}
		System.out.println(sentence);
		
	}
	static Fraction[] createFractionArray(int[] num, int[] denum) {
		
		Fraction[] fractionArray = new Fraction[num.length];
		int i;
		for(i=0; i<num.length; i++) {
			
			fractionArray[i] = new Fraction(num[i], denum[i]);
			
		}
		
		return fractionArray;
	}

}

class Fraction{
	
	private int numerator;
	private int denominator;
	private double fraction;
	
	public Fraction() {
		numerator = 0;
		denominator = 1;
		fraction = numerator/denominator;
	}
	
	public Fraction(int a, int b) {
		numerator = a;
		denominator = b;
		fraction = numerator/denominator;
	}
	
	public Fraction(Fraction frac) {
		numerator = frac.numerator;
		denominator = frac.denominator;
		fraction = numerator/denominator;
	}
	
	
	public void setNumDenom(int a, int b) {
		numerator = a;
		denominator = b;
		fraction = numerator/denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public double getFraction() {
		return fraction;
	}
	
	public int compareTo(Fraction k) {
		if(this.numerator/this.denominator > k.numerator/k.denominator) {
			return 1;
		}
		else if(this.numerator/this.denominator == k.numerator/k.denominator) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	public boolean equals(Fraction k) {
		if(this.numerator/this.denominator == k.numerator/k.denominator) {
			return true;
		} else {
			return false;
		}
		
	}
}

class SortFraction {
	
	public static void sort(Fraction[] a) {
		
		int i;
		for(i=1; i<a.length; i++) {
			
			int k;
			for(k=i-1;k>-1; k--) {
				if(a[k+1].getFraction()<a[k].getFraction()) {
					
					Fraction temp = new Fraction();
					temp = a[k];
					a[k] = a[k+1];
					a[k+1] = temp;
					
				}
					
			}
		}
		
	}

}
