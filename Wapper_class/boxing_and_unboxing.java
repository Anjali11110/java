package Wapper_class;

public class boxing_and_unboxing {

	public static void main(String[] args) {
//		boxing-primitive_to_non-primitive
int a=10;
Integer li=new Integer(a);// it has been usedtill 1.5 version and not used now
System.out.println(li);
//  unboxing-non-primitive to primitive
int b=(int)li;
System.out.println(b);
	}

}
