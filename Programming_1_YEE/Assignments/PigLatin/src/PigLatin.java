import java.util.Scanner;
public class PigLatin {
static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		String stuff = "";
		String[] words;
		System.out.println("Input the Text you Would Like to Translate: ");
		stuff = input.nextLine();
		stuff = stuff.toLowerCase();
		words = stuff.split(" ");
		int x = 0;
		while (x<words.length) {
			char chard;
			chard = words[x].charAt(0);
			if (chard == 'a' || chard == 'e' || chard == 'i' || chard == 'o' || chard == 'u' || chard == 'y') {
				words[x] = words[x].concat("yay");
				
			}
		}
	}

}
