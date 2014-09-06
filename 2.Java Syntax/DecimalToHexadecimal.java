import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String hex = Integer.toHexString(a);
        System.out.println(hex.toUpperCase());
        

	}

}

