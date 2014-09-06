import java.util.Scanner;
public class CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("n= ");
		String value = Integer.toBinaryString(in.nextInt());
		int count = 0;
		for(int i = 0; i<value.length()-1;i++){
			if(value.charAt(i)==value.charAt(i+1))
				count++;
		}
		System.out.println(count);

	}

}
