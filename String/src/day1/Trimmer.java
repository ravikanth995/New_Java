package day1;

public class Trimmer {

	public static void main(String[] args) {
//		String a = "Ravikanth     ";
//		System.out.println("Length of the string is :"+a.length());
//		System.out.println("Length of the String is after trimming :"+a.trim().length());
		   
//		String s = "           Ravikanth";
//		System.out.println("Length of the String before trim.. :"+s.length());
//		System.out.println(s);
//		System.out.println("-".repeat(70));
//		System.out.println("Length of the String after trim...:"+s.trim().length());
//		System.out.println(s.trim());
		
		String s = "           Ravikanth";
		System.out.println("Length of the String before trim.. : " + s.length());
		System.out.println("-".repeat(70));
		System.out.println("| Original String | Trimmed String |");
		System.out.println("-".repeat(70));
		for (int i = 0; i < Math.max(s.length(), s.trim().length()); i++) {
		    char originalChar = i < s.length() ? s.charAt(i) : ' ';
		    char trimmedChar = i < s.trim().length() ? s.trim().charAt(i) : ' ';
		    System.out.printf("| %-16c | %-14c |\n", originalChar, trimmedChar);
		}
		System.out.println("-".repeat(70));

	}

}
