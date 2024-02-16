package Interview_Que;

import java.util.Arrays;

public class searching_element {

	public static void main(String[] args) {
		int a[]  = {1,2,3,5,6,7};
		int search_ele = 3;
		boolean status = false;
		for(int i=0; i<a.length;i++)
		{
			if(search_ele==a[i])
			{
				System.out.println(search_ele+" Element Present in "+Arrays.toString(a));
				status = true;
				break;
			}
			
		}
		if(status == false)
		{
			System.out.println(search_ele+" is Not Found in "+ Arrays.toString(a));
		}
	}

}
