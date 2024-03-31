package Exception_handling;
import java.util.*;
public class ex2 {

	public static void main(String[] args) {
	try {	
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of the number");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("sucessfully created now enter the value");
     for(int i=0;i<a.length;i++) {
    	 a[i]=sc.nextInt();     }
	
	System.out.println("Enter the numerator");
	int num=sc.nextInt();
	System.out.println("Enter the denominator");
    int den=sc.nextInt();
    int ans=num/den;
    System.out.println(ans);
	}
	catch(NegativeArraySizeException na){
		System.out.println("invalid"); 
			}
	catch(ArithmeticException ae){
		System.out.println("invalid"); 
			}
	
	finally {
		System.out.println("thank you");
	}
}}
