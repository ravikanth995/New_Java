package Java_interview;

public class occ_string {

	public static void main(String[] args) {
	String name = "abcbcabc";
	char match1 = 'a';
	char match2 = 'b';
	char match3 = 'c';
	int count1, count2, count3;
	count1=0;
	count2=0;
	count3=0;
	for(int i=0; i<name.length(); i++)
	{
		char currentChar = name.charAt(i);
		if (currentChar == match1) {
	        count1++;
	    } else if (currentChar == match2) {
	        count2++;
	    } else if (currentChar == match3) {
	        count3++;
	    }

	}

System.out.println("Occurrences of 'a': " + count1);
System.out.println("Occurrences of 'b': " + count2);
System.out.println("Occurrences of 'c': " + count3);

	
	
	}

}
