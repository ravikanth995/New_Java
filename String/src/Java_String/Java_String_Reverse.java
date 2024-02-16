package Java_String;

public class Java_String_Reverse {

	public static void main(String[] args) {
		String a = "Welcome";
		String rev = "";
		for(int i=a.length()-1; i>=0; i--)
		{
			rev =rev+a.charAt(i);
		}
		System.out.println(rev);
	}

}
