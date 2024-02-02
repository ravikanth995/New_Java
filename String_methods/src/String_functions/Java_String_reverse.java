package String_functions;

public class Java_String_reverse {

	public static void main(String[] args) {
		String name = "Ravikanth";
		String rev = "";
		for(int i=name.length()-1; i>=0;i--)
		{
			rev = rev+name.charAt(i);
		}
			
		System.out.println(rev);

	}

}
