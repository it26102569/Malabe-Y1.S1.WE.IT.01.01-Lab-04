import java.util.Scanner;
	public class IT26102569Lab4Q2 {
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter exam marks: ");
			
			double examMarks = input.nextDouble();
			
			if (examMarks < 0 || examMarks > 100) {
			System.out.println("Invalid input for exam marks");
			return;
			}
			
			System.out.print("Please enter Lab submission marks (out of 100): ");
			
			double labMarks = input.nextDouble();
			
			if (labMarks < 0 || labMarks > 100) {
			System.out.println("Invalid input for lab submission marks");
			
			return;
			}
			System.out.print("Please enter the percentage given for the exam: ");
			
			double examPercentage = input.nextDouble();
			
			System.out.print("Please enter the percentage given for the lab submission: ");
			
			double labPercentage = input.nextDouble();
			
			if (examPercentage + labPercentage != 100) {
			System.out.println("The percentages must add up to 100, Terminating program.");
			
			return;
			}
			double finalMark = (examMarks * examPercentage / 100)
			
			(labMarks * labPercentage / 100);
			System.out.println("Final Exam Mark is : " + finalMark);
			
			input.close();
		}
	}