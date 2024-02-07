package Interview_Que;

public class sum_digits {
	public static void main(String[] args) {
		int num = 123;
		int sum = 0;
		int temp = num;
		while(num>0)
		{
			sum = sum+(num%10);              //123/10=3, 3+0 = sum = 3, 
			num = num/10;
			
		}
		System.out.println("Sum of "+temp+" is "+sum);

	}

}
