package Java_interview;

public class String_palindrome {

	public static void main(String[] args) {
//		String s = "madam";
//		String rev = "";
//		String temp = s;
//		for(int i=s.length()-1; i>=0; i--)
//		{
//			rev = rev+s.charAt(i);
//			
//		}
//if(temp.equals(rev))
//{
//	System.out.println("It is Palindrom");
//}
//else
//{
//	System.out.println("It is not Palindrome.");
//}
		
		
		
		String name = "madam";
		String rev ="";
		String temp = name;
		for(int i=name.length()-1; i>=0; i--)
		{
		rev = rev+name.charAt(i);	
		}
		
		if (temp.equals(rev))
		{
			System.out.println(temp+"=It is Palindrome");
		}
		else
		{
			System.out.println(temp+"=It is not Palindrome");
		}
	}
	

}
