package Arrays;

public class Arrays_SUms {

	public static void main(String[] args) {
	int a[] = {1,2,3,4,5,6,7};
	int even_count=0, odd_count = 0;
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
	System.out.println("Even Integers are:"+even_count);
	System.out.println("Odd Integers are :"+odd_count);

	}

}
