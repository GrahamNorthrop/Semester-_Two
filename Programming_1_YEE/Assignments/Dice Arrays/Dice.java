
public class Dice {

	public static void main(String[] args) {
		int myList[] = new int[100];
		int a = 0;
		while (a<myList.length) {
			myList[a]=a;
			
			a++;
		}
		System.out.println(myList[(int) (Math.random()*myList.length)]);
	}
}
