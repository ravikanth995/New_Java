package Java_interview;

public class occ_count {

	public static void main(String[] args) {
//				
		String name = "abcabcabcabcabcabc";
		int count = 0;
		String times = "abc";
		for(int i=0; i<name.length()-times.length(); i++)
		{
						if(name.substring(i, i+times.length()).equals(times))
						{
							count += 1;
						}
		}
		System.out.println(count);

		

	}

}
