package Arrays;

public class even_odd_count {

	public static void main(String[] args) {
	int ar[] = {1,2,3,4,5};
	int even_count = 0;
	int odd_count = 0;
	for(int i=0; i<ar.length; i++)
	{
		if (i%2==0)
		{
			even_count += 1;
			
		}
		else
		{
			odd_count += 1;
		}
	}
	System.out.println("Even Number are :"+even_count);
	System.out.println("Odd Number is :"+odd_count);

	}

}
