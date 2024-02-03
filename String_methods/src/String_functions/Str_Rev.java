package String_functions;

public class Str_Rev {

	public static void main(String[] args) {
		String name = "Ravikanth";
		String rev="";
		char ar[] = name.toCharArray();
		for(int i=ar.length-1; i>=0; i--)
		{
			rev = rev+ar[i];		
			}
		System.out.println(rev);

	}

}
