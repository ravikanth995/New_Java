package Arrays;

public class Multiple_Arrays {

	public static void main(String[] args) {
		int a[][] = {{1,2,3,4,5}, {4,5,6,7,8}};
		System.out.println("Number of Rows is :"+a.length);
		boolean status=false;
		for(int r=0; r<a.length; r++)
		{
			System.out.println("length of the Column :"+a[r].length);
			status = true;
			break;
		}
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
	
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}System.out.println();
		}
	}

}
