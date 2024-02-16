package Arrays;

public class Sum_of_Arrays {

	public static void main(String[] args) {
		
		int ar[] = {1,2,3,4};
		int sum=0;
		for(int i=0; i<ar.length; i++)
		{
			int rem = ar[i]%10;
			sum = sum+rem;
			ar[i] = ar[i]/10;
		}
		System.out.println(sum);
	

	}

}
