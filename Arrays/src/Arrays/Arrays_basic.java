package Arrays;
import java.util.Arrays;
public class Arrays_basic {
	public static void main(String[] args) {
	int a[] = new int[3];
    a[0] = 12;
    a[1] =13;
    a[2]=9;
    System.out.println(a.length);
    System.out.println(Arrays.toString(a));
//    for(int i=0; i<a.length; i++)
//    {
//    	System.out.println(a[i]);
//    }
    
    for(int x:a)
    {
    	System.out.println(x);
    }
	}
}
