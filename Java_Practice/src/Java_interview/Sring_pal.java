package Java_interview;

public class Sring_pal {

	public static void main(String[] args) {
	String name = "madam";
	String rev = "";
	String temp=name;
	
	for(int i=name.length()-1; i>=0; i--)
	{
		rev =rev+name.charAt(i);
	}

	if(temp.equals(rev))
	{
		System.out.println("It is Palindrome");
	}
	else
	{
		System.out.println("it is not Palindrome");
	}
	}

}
