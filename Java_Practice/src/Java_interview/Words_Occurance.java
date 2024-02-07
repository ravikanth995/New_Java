package Java_interview;

public class Words_Occurance {

	public static void main(String[] args) {
		String name = "abcabcabcabcabca";
		char[] matches = {'a', 'b', 'c'};
		int[] counts = new int[3];

		for (int i = 0; i < name.length(); i++) {
		    char currentChar = name.charAt(i);
		    for (int j = 0; j < matches.length; j++) {
		        if (currentChar == matches[j]) {
		            counts[j]++;
		            break; // Once a match is found, no need to continue checking
		        }
		    }
		}

		for (int i = 0; i < matches.length; i++) {
		    System.out.println("Number of times '" + matches[i] + "' repeated is: " + counts[i]);
		}

	}

}
