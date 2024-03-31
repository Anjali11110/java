package Wapper_class;

public class number_format_exception {

	public static void main(String[] args) {
		try {
		String s="abc123";
		int a=Integer.parseInt(s);
		}
		catch (Exception e) {
			System.out.println("Number format exception");
		}
	}

}
