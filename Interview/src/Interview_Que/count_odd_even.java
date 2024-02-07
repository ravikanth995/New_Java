package Interview_Que;

public class count_odd_even {

	public static void main(String[] args) {
		int even_num = 0; 
		int odd_num = 0;
		int num = 1234;
		while (num>0)
		{
			int rem = num%10;
			if(rem%2==0)
			{
				even_num++;
			}
			else
			{
				odd_num++;
			}
			
			num /= 10;
			
		}System.out.println(even_num);
		System.out.println(odd_num);
			

	}

}
