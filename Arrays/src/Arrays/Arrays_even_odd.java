package Arrays;

public class Arrays_even_odd {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int even_count=0, odd_count=0;
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
		System.out.println("Even Number is :"+even_count);
		System.out.println("odd Number is :"+odd_count);
	}

}
