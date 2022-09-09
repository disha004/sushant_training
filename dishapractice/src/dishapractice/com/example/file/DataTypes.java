package dishapractice.com.example.file;

public class DataTypes {

	public static void main(String[] args) {
		welcome wel = new welcome();
		String str = "Disha";
		String str2 = "Disha";
		String str3 = "Disha";
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(wel.str.hashCode());
		System.out.println(welcome.value);
		System.out.println(welcome.class.hashCode());
		welcome.myMethod();
	}
	
}
