package Java_String;

import java.util.Arrays;

public class SPlit_String {

	public static void main(String[] args) {
		String a = "ravi, kanth@gmail.com";
		String ar[] = a.split(",");
		System.out.println(Arrays.toString(ar));
		
		String arr[] = ar[1].split("@");
		System.out.println(Arrays.toString(arr));
		System.out.println(ar[0]);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		

	}

}
