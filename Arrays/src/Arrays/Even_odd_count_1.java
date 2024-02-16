package Arrays;

public class Even_odd_count_1 {

	public static void main(String[] args) {
		int odd_count=0; ;
		int even_count  = 0;
		int a[] = {1,2,3,4,5,6,7};
		
		for(int i=a.length-1; i>=0; i--)
		{
			if (a[i]%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
		}
		System.out.println(even_count);
		System.out.println(odd_count);
		
		
		

	}

}
