package String_functions;

public class Rev_String {

	public static void main(String[] args) {
	String name = "ravikanth";
	String rev = "";
	for(int i=name.length()-1; i>=0; i--)
	{
		rev = rev+name.charAt(i);
	}
	System.out.println("String before Reverse: "+name);
System.out.println("String after Reverse: "+rev);
	}

}
