import java.util.Scanner;


public class _3_LargestSequenceEqualStrings {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String[] results = in.nextLine().split(" ");
		
		String strSame = results[0];
		int same = 1;
        int longestLength = same;
        for (int i = 0; i < results.length - 1; i++)
        {
            same = isEqual(results, same, i);
            if (longestLength < same)
            {
                longestLength = same;
                strSame = results[i];
            }
        }
        for(int y = 0; y<longestLength; y++){
        	System.out.print(strSame + " ");
        }
	}
	private static int isEqual(String[] results, int same, int i) {
		if (results[i].equals(results[i + 1])){
		    same++;
		}else {
			same = 1;
		}	
		return same;
	}
}

