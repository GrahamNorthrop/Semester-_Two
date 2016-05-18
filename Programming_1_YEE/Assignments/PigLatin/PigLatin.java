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
				String firstLetter = words[x].substring(0,1);
				String restofword = words[x].substring(1);
				String pig = "ay";
				words[x] = restofword + firstLetter 
				x++;
			}
		String output = words[x];
		System.out.println(output);
		}
	}