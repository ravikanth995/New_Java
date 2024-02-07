package Java_interview;

public class Java_Words {

	public static void main(String[] args) {
		String name = "abcabcbacbacbaba";
		char ar [] = {'a', 'b', 'c'};
		int count [] = new int[3];
		
		for(int i=0; i<name.length(); i++)
		{
			char words = name.charAt(i);
			if (words == 'a')
			{
				count[0]++;
			}
			else if(words == 'b')
			{
				count[1]++;
			}
			else if(words == 'c')
			{
				count[2]++;
			}
		}
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.println("Number of times "+ar[i]+" Repeated is :"+count[i]);
		}

	}

}
