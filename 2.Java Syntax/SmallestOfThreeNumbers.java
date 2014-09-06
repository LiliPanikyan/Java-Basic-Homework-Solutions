import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b =in.nextDouble();
		double c = in.nextDouble();
		if (a<b && a<c) {
            System.out.println(format.format(a));
    }else if (b<a && b<c) {
            System.out.println(format.format(b));
    }else {
            System.out.println(format.format(c));
    }
    
	}

}

