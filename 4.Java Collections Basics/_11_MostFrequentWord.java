import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class _11_MostFrequentWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] text = in.nextLine().toLowerCase()
			.split("([().,!?:;'\"-]|\\s)+");
		
		Map<String, Integer> myCollection = new TreeMap<String, Integer>();
		int maxCount = 0;
		maxCount = countWords(text, myCollection, maxCount);

		printResult(myCollection, maxCount);
    }

	private static void printResult(Map<String, Integer> myCollection,
			int maxCount) {
		for (Map.Entry<String, Integer> max : myCollection.entrySet()) {
		    if (max.getValue() == maxCount) {
			System.out.printf("%s -> %d times\n", max.getKey(),
				max.getValue());
		    }
		}
	}

	private static int countWords(String[] text,
			Map<String, Integer> myCollection, int maxCount) {
		for (String word : text) {
		    Integer count = myCollection.get(word);
		    if (count == null) {
			count = 0;
		    }
		    if (count + 1 > maxCount) {
			maxCount = count + 1;
		    }
		    myCollection.put(word, count + 1);
		}
		return maxCount;
	}

}

