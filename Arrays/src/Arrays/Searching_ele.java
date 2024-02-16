package Arrays;

import java.util.Arrays;

public class Searching_ele {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int search_ele = 3;
		boolean status = false;
		for(int i=0; i>=0; i++)
		{
			if (search_ele == a[i])
			{
				System.out.println("Element "+search_ele+" is present in "+Arrays.toString(a));
				status= true;
				break;
			}
			
			
		}
		
		if(status ==false)
		{
			System.out.println(search_ele+" Element is not Found."+a);
		}

	}

}
