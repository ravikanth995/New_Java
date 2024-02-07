package Interview_Que;
import java.util.Scanner;
public class Reverse_num {

	public static void main(String[] args) {
		//input = 1234
		//output = 4321
		int rev = 0;
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter Number to be reversed :");
			int  num = sc.nextInt();
			
			while(num>0)
			{
				int rem = num%10;
				rev = (rev*10)+rem;
				num = num/10;
			}
			System.out.println("Reversed numbers are :"+rev);
		}
		
		

	}

}
