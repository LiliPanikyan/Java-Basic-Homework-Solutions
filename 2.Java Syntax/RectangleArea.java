import java.util.Scanner;
public class RectangleArea {

	public static void main(String[] args) {
		int a, b, z;
		System.out.println("Eneter side a and side b in a separate line: ");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		z = a*b;
		System.out.println("Rectangle area = " + z);

	}

}

