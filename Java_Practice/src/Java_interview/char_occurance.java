package Java_interview;

public class char_occurance {

	public static void main(String[] args) {
		String words = "abcabcabcabc";
		char matches[] = {'a', 'b', 'c'};
		int counts[]	 =new int [3];
		
		for(int i=0; i<words.length(); i++)
		{
			char current_Char = words.charAt(i);
			for(int j=0; j<matches.length; i++)
			{
				if (current_Char==matches[j])
				{
					counts[j] += 1;
					break;
				}
			}			
		}
		for(int i=0; i<matches.length; i++)
		{
			System.out.println("Number of times '" + matches[i] + "' repeated is: " + counts[i]);
		}
		//Push
		

	}

}
