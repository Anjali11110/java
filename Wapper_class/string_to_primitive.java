package Wapper_class;

public class string_to_primitive {

	public static void main(String[] args) {
		String a="10",b="10.00",c="amu";
        int i=Integer.parseInt(a);
        float f=Float.parseFloat(b);
        char cc=c.charAt(1);
        System.out.println(i);
        System.out.println(f);
        System.out.println(cc);
	}

}
