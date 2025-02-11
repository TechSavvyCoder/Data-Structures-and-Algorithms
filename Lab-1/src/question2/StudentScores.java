package question2;

import java.util.Scanner;

public class StudentScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] studentIDs = {101, 102, 103, 104, 105};
		int[] scores = new int[studentIDs.length];
		
		for(int i=0; i<studentIDs.length; i++) {
			System.out.print("Enter score for " + studentIDs[i] + ": ");
			try {
				int score = scanner.nextInt();
				
				if(score < 0 || score > 100) {
					throw new ScoreException("Invalid score!");
				}
				scores[i] = score;
			} catch(ScoreException ex) {
				System.out.println(ex.getMessage());
				scores[i] = 0;
			}
		}
		
		System.out.println("\nStudent Scores:");
		for(int i=0; i<studentIDs.length; i++) {
			System.out.println("Student ID: " + studentIDs[i] + " | Score: " + scores[i]);
		}
		
		scanner.close();
	}

}
