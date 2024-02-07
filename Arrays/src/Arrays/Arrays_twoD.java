package Arrays;

public class Arrays_twoD {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6}, {7,8,9}};
		System.out.println("Length of the Arrays is :"+a.length);
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.println(x);
			}
		}

	}

}
