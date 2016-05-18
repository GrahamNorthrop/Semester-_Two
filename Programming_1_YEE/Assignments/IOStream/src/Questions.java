import java.util.Scanner;
public class Questions {

	public static void main(String[] args) {
		String[] questions = new String[10];
		questions[0] = "What is the meaning of life?";
		questions[1] = "Why do cows say 'MOO'?";
		questions[2] = "What is wrong with Andy?";
		questions[3] = "What is the airspeed velocity of an unlaiden swallow?";
		questions[4] = "What type of swallow is non-migratory and could carry a coconut?";
		questions[5] = "What does Buttercup realize Wesley means when he says 'as you wish'?";
		questions[6] = "For most of American history, Americans sought to resolve their political conflicts through compromise. \nBut by 1860, this no longer seemed possible. \nAnalyze the reasons for this change.";
		questions[7] = "What 'S' shaped letter comes between 'R' and 'T'";
		questions[8] = "What is the formula for the angular momentum of a pendulum?";
		questions[9] = "Who is Andre the Giant?";
		int x = (int) (Math.random()*questions.length);
		System.out.println(questions[x]);
		Scanner input = new Scanner(System.in);
		String ans = input.nextLine();
		WritetoFile w = new WritetoFile();
		w.write(questions[x], ans);
	}
}