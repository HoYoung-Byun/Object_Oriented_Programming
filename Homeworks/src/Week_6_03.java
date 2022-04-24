import java.lang.reflect.Method;

public class Week_6_03 {
	  public static void main(String[] args) {
			int score1[][] = {{3, 2, 1, 5}, {2, 3, 0, 4}, {4, 0, 0, 5}}; 
			int score2[][] = {{4, 4, 4, 5}, {0, 0, 1, 2}, {3, 3, 2, 4}}; 
			int score3[][] = {{1, 2, 3, 4}, {0, 4, 2, 3}, {3, 5, 4, 1}}; 
			
			Rating rating = new Rating(3, 3);  // 3 evaluators, 3 products 
			
			// set all scores into rating
			for (int i = 0; i < 3; i++) {
					rating.setScore(0,  i,  score1[i][0], score1[i][1], score1[i][2], score1[i][3]); 
					rating.setScore(1,  i,  score2[i][0], score2[i][1], score2[i][2], score2[i][3]);
					rating.setScore(2,  i,  score3[i][0], score3[i][1], score3[i][2], score3[i][3]);
			}
			
			int answer = rating.averageScore();
			System.out.println("Average score of all evaluators for all products in all categories = " + answer);
			
			for (int i = 0; i < 3; i++) {
				answer = rating.averageScore(i);
				System.out.println("Average of all evaluators for product " + i + " = " + answer);
			}
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					answer = rating.averageScore(i, j); 
					System.out.println("Average of evaluator " + i + " for product " + j + " = " + answer); 
				}
			}
			
			String criteriaName[] = {"QUALITY", "DESIGN", "PRICE", "CONVENIENCE"};
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 4; j++) {
					answer = rating.averageScore(i, criteriaName[j]);
					System.out.println("Average of product " + i + " for criteria " + criteriaName [j] + " = " + answer); 
				}
			}
		}
}

class Rating {
    
	int[][][] score;
	
	public Rating() {
		
		score = new int[3][3][4];
		
	}
	
	public Rating(int evaluator, int product) {
		
		score = new int[evaluator][product][4];
		
	}
	
	public void setScore(int evaluator, int product,  int scoreSection1, int scoreSection2, int scoreSection3, int scoreSection4) {
		score[evaluator][product][0] = scoreSection1;
		score[evaluator][product][1] = scoreSection2;
		score[evaluator][product][2] = scoreSection3;
		score[evaluator][product][3] = scoreSection4;
	}
	
	public int averageScore() {
		
		int i, j, k;
		double sum = 0;
		int numScore = 0;
		int average = 0;
		
		for(i=0 ; i<score.length; i++) {
			for(j=0; j<score[i].length; j++) {
				for(k=0; k<score[i][j].length; k++) {			
					sum += score[i][j][k];
					numScore += 1;
				}		
			}
		}
		average = (int) Math.round(sum/numScore);
		return average;
	}
	
	public int averageScore(int product) {
		
		double sum = 0;
		int numScore = 0;
		int average = 0;
		int i,j ;
		
		for(i=0; i<score.length; i++) {
			for(j=0; j<score[i][product].length; j++) {
				
				sum += score[i][product][j];
				numScore += 1;
			}
		}
		
		average = (int) Math.round(sum/numScore);
		return average;
		
	}

	public int averageScore(int evaluator, int product) {
		
		double sum = 0;
		int numScore = 0;
		int average = 0;
		int i;
		
		for(i=0; i<score[evaluator][product].length; i++) {
			sum += score[evaluator][product][i];
			numScore += 1;
		}
		average = (int) Math.round(sum/numScore);
		return average;
	}

	public int averageScore(int product, String criteria) {
		
		double sum = 0;
		int numScore = 0;
		int average = 0;
		int i;
		
		for(i=0; i<score.length; i++) {
			
			if(criteria.equals("QUALITY")) {
				sum += score[i][product][0];
				numScore += 1;
			}
			
			else if(criteria.equals("DESIGN")) {
				sum += score[i][product][1];
				numScore += 1;
			}
			else if(criteria.equals("PRICE")) {
				sum += score[i][product][2];
				numScore += 1;
			}
			else {
				sum += score[i][product][3];
				numScore += 1;
			}
		}
		average = (int) Math.round(sum/numScore);
		return average;
		
	}
}




