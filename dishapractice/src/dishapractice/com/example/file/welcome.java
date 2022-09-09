package dishapractice.com.example.file;

/**
 * 
 * @author sushantparkhe
 *
 */
public class welcome {

	public static String value = "Test";
	public String str = "Disha3";
	public static StaticBasics staticBasics = null;
	static {
		staticBasics = new StaticBasics();
		System.out.println("I am static block");
	}
	static {
		System.out.println("I am SIB 2");
	}

	public static void myMethod() {
		staticBasics.setInterger(4);
		System.out.println("Print me I am static method");
		System.out.println(staticBasics.getInterger()*2);
	}
}
