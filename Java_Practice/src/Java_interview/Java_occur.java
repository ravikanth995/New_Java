package Java_interview;

public class Java_occur {

	public static void main(String[] args) {
		String words = "abcabcabcabacabac";
		char ar[] = {'a', 'b', 'c'};
		int count [] = new int [3];
		
		for(int i=0; i<words.length(); i++)
		{
			char words_match = words.charAt(i);
					if (words_match == 'a')
					{
						count[0]++;
					}
					else if(words_match=='b')
					{
						count[1]++;
					}
					else if (words_match=='c')
					{
						count[2]++;
					}
		}
		for(int i=0; i<ar.length; i++)
		{
System.out.println("Number of times "+ar[i]+"  Repeated is :"+count[i]);
		}}

}
