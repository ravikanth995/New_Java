package Java_interview;

public class Space_remove {

	public static void main(String[] args) {
		String name = "Ravi   kanth  chavan      chittapur";
		String ar[] = name.split(" ");
		String temp = "";
		for(int i=0; i<ar.length; i++)
		{
			temp= temp+ar[i];
		}
System.out.println(temp);
	}

}
