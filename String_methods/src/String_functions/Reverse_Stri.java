package String_functions;

public class Reverse_Stri 
{

	public static void main(String[] args) 
	{
		String name = "Ravikanth";
		String rev = "";
		char[] ar= name.toCharArray();
		
		for(int i=name.length()-1; i>=0; i--)
		{
			rev = rev+ar[i];
		}
		System.out.println(rev);
	}

}
