package Java_interview;

public class Occurance_words {

	public static void main(String[] args) {
		String name = "aaaaaabbbbbccccdddd";
		char ar[] = {'a', 'b', 'c'};
		int count[] = new int[3];
		for(int i=0; i<name.length(); i++)
		{
			char char_Occ = name.charAt(i);
			if (char_Occ == 'a')
			{
				count[0]++;
			}
			else if (char_Occ == 'b')
{ count[1]++;
	
}
			else if (char_Occ=='c')
			{
				count[2]++;
}
		}
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.println("Number of times "+ar[i]+ " : Repeated is :"+count[i]);
		}

	}

}
