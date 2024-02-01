package String_functions;

import java.util.Arrays;

public class String_funcs {

	public static void main(String[] args) {
//	String ar = "Ravikanth";
//	String ar1 = "ravikanth";
//	System.out.println(ar.equalsIgnoreCase(ar1));
		
		//toUpperCase
//		String ar = "ravikanth";
//		System.out.println(ar.toUpperCase()); 
		
//		String ar1  ="RAVIKANTH";
//		System.out.println(ar1.toLowerCase());
		
		//split()
//		String ar = "ravikanthchauhan95@gmail.com";
//		String a[] = ar.split("@");
//		System.out.println(a[0]);
//		System.out.println(a[1]);

//		String ar = "Ravikanthchauhan@gmail.com";
//		String a[]  = ar.split("@");
//		System.out.println(a[0]);
//		System.out.println(a[1]); 
		
//		String ar = "Ravikanthchauhan95@gmail.com";
//		String a[] = ar.split("@");
//		System.out.println(a[0]);
//		System.out.println(a[1]);
		
//		String s = "Ravikanthchauhan@gmail.com";
//		String a[] = s.split("@");
//		System.out.println(a[0]);
//		System.out.println(a[1]);
		
//		String r = "Ravikanthchuahan95@gmail.com";
//		String a[] = r.split("@");
//		System.out.println(a[0]);
//		System.out.println(a[1]);
		
//		String s = "Ravikanthchauhan96@gmail.com";
//		String a [] = s.split("@");
//		System.out.println(a[1]); 
		
//		String s = "ravikanthchauhan95@gmail.com";
//		String a[] = s.split("@");
//		System.out.println(Arrays.toString(a));
		
		String s = "ravikanthchauhan95@gmail.com";
		String a[] = s.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(Arrays.toString(a));
		
		String amount = "$20,20,60";
		System.out.println(amount.replace("$", "").replace(",", ""));
		
		
		
		
	}

}
