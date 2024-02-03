package Mutability;

public class equals_to {

	public static void main(String[] args) {
//		String s1 = "ravikanth";
//		String s2 = "ravikanth";
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//		
//		String s3 = new String ("welcome");
//		String s4 = new String ("welcome");
//		System.out.println("-------------------------------");
//		System.out.println(s3==s4);
//		System.out.println(s3.equals(s4));
		
//		String s1= new String ("ravikanth");
//		String s2 = new String ("ravikanth");
//		
//		System.out.println(s1==s2);// they are two different objects and objects are not same
//		System.out.println(s1.equals(s2));//It checks the contents of the objects
		
//		String s1 = "ravi";
//		String s2 = new String ("ravi");
//		System.out.println(s1==s2);//false
//		System.out.println(s1.equals(s2));//false
         
		String s1 = "ravi";
		String s2 = new String("ravi");
		String s3=s2;
		
		System.out.println(s3==s2);//true
		System.out.println(s2.equals(s3));//true
		System.out.println(s1==s3);//false
		
		
		
		
		
		
		
		
		
		

	}

}
