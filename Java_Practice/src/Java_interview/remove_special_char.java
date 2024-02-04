package Java_interview;

public class remove_special_char {

	public static void main(String[] args) {
	
		String name = "Hello! How !are !you";
		String temp ="";
		for(int i=0; i<name.length(); i++)
		{
			temp =name.replace("!", "");
		}

		System.out.println(temp);
	}

}
