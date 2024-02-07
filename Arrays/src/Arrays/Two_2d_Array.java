package Arrays;

public class Two_2d_Array {

	public static void main(String[] args) {
		int a[][] = {{1, 2, 3,}, {4,5,6}, {7,8,9}};
		System.out.println("Length of the Arrays is :"+a.length);
		for(int r=0; r<=a.length-1; r++)
		{
			for(int c=0; c<=a[r].length-1; c++)
			{
				System.out.println(a[r][c]+"\t");
			}
		}System.out.println();

	}

}
