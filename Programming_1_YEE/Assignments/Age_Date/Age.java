import java.util.*;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
public class Age {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Date date = new Date();
		int Bmonth, Bday, Byear, day, month, year;
		float yAge, dAge, mAge, dec, cent, mil, hrs, mins, secs;
		SimpleDateFormat s;
		System.out.println("Input your Birthday in the form Month/Day/Year: ");
		String i = input.nextLine();
		String[] birth = i.split("/");
		Bmonth = Integer.valueOf(birth[0]);
		Bday = Integer.valueOf(birth[1]);
		Byear = Integer.valueOf(birth[2]);
		s = new SimpleDateFormat("MM");
		month = Integer.valueOf(s.format(date));
		s = new SimpleDateFormat("dd");
		day = Integer.valueOf(s.format(date));
		s = new SimpleDateFormat("yyyy");
		year = Integer.valueOf(s.format(date));
		yAge = year-Byear;
		mAge = month-Bmonth;
		dAge = day-Bday;
		if (mAge<0) {
			yAge--;
		}
		mAge = yAge*12;
		if (dAge<0) {
			mAge--;
		}
		dAge = yAge*365;
		dec = yAge/10;
		cent = yAge/100;
		mil = cent/10;
		hrs = dAge*24;
		mins = hrs*60;
		secs = mins*60;
		
		System.out.println("Millenia: "+mil);
		System.out.println("Centuries: "+cent);
		System.out.println("Decades: "+dec);
		System.out.println("Years: "+yAge);
		System.out.println("Months: "+mAge);
		System.out.println("Days: "+dAge);
		System.out.println("Hours: "+hrs);
		System.out.println("Minutes: "+mins);
		System.out.println("Seconds: "+secs);
	}
}
