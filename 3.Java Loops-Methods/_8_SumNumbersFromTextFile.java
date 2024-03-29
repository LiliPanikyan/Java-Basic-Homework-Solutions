import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _8_SumNumbersFromTextFile {
	
	public static void main(String[]args){
		
		int sum = 0;
		try (BufferedReader in = new BufferedReader(new FileReader(
				"input.txt"));) {
			while (true) {
				String line = in.readLine();
				if (line == null) {
				    break;
				}
				sum += Integer.parseInt(line);
			    }
			} catch (IOException e) {
			    System.out.println("Error");
			}
			System.out.println(sum);
	}
}
