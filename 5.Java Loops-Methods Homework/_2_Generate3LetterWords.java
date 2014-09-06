import java.util.Scanner;
public class _2_Generate3LetterWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[]letters = input.next().toCharArray();
		for(int i = 0; i<letters.length;i++){
			for(int y = 0; y<letters.length; y++){
				for(int z = 0; z<letters.length;z++){
					System.out.printf("%c%c%c ",letters[i], letters[y], letters[z]);
				}	
			}
		}
	}
}
