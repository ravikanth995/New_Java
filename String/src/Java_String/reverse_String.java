package Java_String;

public class reverse_String {

	public static void main(String[] args) {
		String a = "welcome";
		String rev ="";
		for(int i=a.length()-1; i>=0; i--)
		{
		    rev = rev+a.charAt(i);	
		}

		System.out.println(rev);
	}

}
