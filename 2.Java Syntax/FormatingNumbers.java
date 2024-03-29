import java.util.Locale;
import java.util.Scanner;

public class FormatingNumbers {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		System.out.print("a: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("b: ");
		double b = sc.nextDouble();
		System.out.print("c: ");
		double c = sc.nextDouble();
		String hexAString = Integer.toHexString(a).toUpperCase();
		String binAString = Integer.toBinaryString(a);
		System.out.println();
		System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", hexAString,
			Integer.parseInt(binAString), b, c);
	}

}

