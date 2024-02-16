package Arrays;

import java.util.Arrays;

public class Arrays_Basic_1 {

	public static void main(String[] args) {
//	int a[] = new int [5];
//	a[0] = 1;
//	a[1] = 2;
//	a[2] = 3;
//	a[3] = 4;
//	a[4] =5;	
//	System.out.println(Arrays.toString(a));
//	System.out.println(a.length);
//	System.out.println(a[1]);
//	
//	int ar[] = {1,2,3,4,5};
//	System.out.println(ar.length);
//	for(int i=0; i<ar.length; i++)
//	{
//		System.out.print(ar[i]+" ");
//	}
//	
    int a[][] = {{1,2,3,4}, {4,5,6,7}};
//    for(int r=0; r<=1; r++)
//    {
//    	for(int c=0; c<=3; c++)
//    	{
//    		System.out.print(a[r][c]+" ");
//    	}
//    }
		
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
		}
	}

}
