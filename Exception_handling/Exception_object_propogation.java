package Exception_handling;

public class Exception_object_propogation {
//   static void demo(int a, int b) {
//	   System.out.println(a/b);
//   }
//	public static void main(String[] args) {
//		demo(4,0);
//
//	} error:= ArithmeticException and exception object propogation
// handling
//	1)
	
//	static void demo(int a, int b) {
//		try {
//		   System.out.println(a/b);
//	   }
//		catch (Exception e) {
//			System.out.println("error");
//		}
//	}
//		
//		public static void main(String[] args) {
//			demo(4,0);		}

// 2)
static void demo1(int a, int b) {

	   System.out.println(a/b);
   }
 public static void main(String[] args) {
	try {
		demo1(4,0);
	}
	catch(Exception e){
		System.out.println("error");
	}
}
}
