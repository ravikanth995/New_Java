package Arrays;

import java.util.Arrays;

public class Arrays_Sort {

	public static void main(String[] args) {
	   int a[] = {9,8,7,6,5,4,3,2,1};
	   int swap;
	   System.out.println("Unsorted Arrays..........");
	   System.out.println(Arrays.toString(a));
	   
	   for(int i=0; i<a.length; i++)
	   {
		   for(int j=i+1; j<a.length; j++)
		   {
			   if (a[i]>a[j])
			   {
				   swap = a[i];
				   a[i] = a[j];
				   a[j] = swap;
			   }
			   
		   }
	   }

	   
	   System.out.println("Sorted Arrays.............");
	   System.out.println(Arrays.toString(a));
	}

}
