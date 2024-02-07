package Interview_Que;

import java.util.Scanner;

public class counting_digits {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int count = 0;
			System.out.print("Enter Number :");
			int num = sc.nextInt();
			int temp = num;
			while (num!=0)
			{
				num /= 10;
				count++;
			}
			System.out.println("Number of times :"+temp+" Counted is :"+count);
		}

	}

}
