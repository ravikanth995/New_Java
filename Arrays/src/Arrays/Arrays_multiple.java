package Arrays;

import java.util.Arrays;

public class Arrays_multiple {

	public static void main(String[] args) {
		int a[][] = {{1,2,3}, {4,5,6},{7,8,9}};
		System.out.println(a.length);
//		System.out.println(Arrays.toString(a));
		for(int r=0; r<=a.length-1; r++)
		{
			for(int c=0; c<=a[r].length-1; c++)
			{
				System.out.println(a[r][c]);
			}
		}

	}

}
