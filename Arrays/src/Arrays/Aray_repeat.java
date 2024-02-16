package Arrays;

import java.util.Arrays;

public class Aray_repeat {

	public static void main(String[] args) {
		int a[] = {1,1,1,1,2,3,4,5,5,5,6,9};
		int count=0;
		int num = 1;
		for(int i=0; i<a.length; i++)
		{
			if (num==a[i])
			{
				count++;
			}
		}
		
		System.out.println("Number of times "+num+" in "+Arrays.toString(a)+" is :"+count);

	}

}
