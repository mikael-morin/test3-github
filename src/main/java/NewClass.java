import java.util.ArrayList;
import java.util.List;

public class NewClass {

	public static void main(String args[]) {
		myMethod(5);
		
		List<String> ls = new ArrayList<String>();
		ls.add("hello");
		System.out.println(ls.get(0));
	}


	private static void myMethod(int j) {
		int i = 9;
		float f = 3f;
		
		System.out.println(i);
		System.out.println(f);
	}
}
