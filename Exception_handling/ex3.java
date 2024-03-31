package Exception_handling;
import java.util.*;
public class ex3 {

public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array");
		try {
			int size=sc.nextInt();
			int a[]=new int[size];
			
			System.out.println("array created succesfully "+"\n"+"enter the array elements");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("element stored");
			System.out.println("enter numerator index value");
			int num=sc.nextInt();
			System.out.println("enter denominator index value");
			int den=sc.nextInt();
			int res=num/den;
			System.out.println(res);
		
		}
		 catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("dont divide by zero");
			}
			catch(InputMismatchException e)
			{
				System.out.println("enter only numeric value");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("cant access -ve value or size more than array");
			}
			catch (NegativeArraySizeException e) {
				// TODO: handle exception
				System.out.println("enter only + ve number");
			}
			catch(Exception e)
			{
				System.out.println("error occured ! Retry!");
			}
			catch (Throwable e) {
				// TODO: handle exception
				System.out.println("Application creashed! Restart");
			}

		}

	}


