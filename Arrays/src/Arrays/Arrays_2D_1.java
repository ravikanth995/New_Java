package Arrays;

import java.util.Arrays;

public class Arrays_2D_1 {
	public static void main(String[] args) {
		int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		for(int i=0; i<=a.length-1; i++)
		{
			for (int j=0; j<=a[i].length-1; j++)
			{
				System.out.println(a[i][j]);
			}
		}
		System.out.println(Arrays.toString(a[2]));
	}
}
