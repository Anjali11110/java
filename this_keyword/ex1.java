package this_keyword;

 public class ex1 {
  int a;
  String name="An";
  double d;
   void display(int a,double d,String name) {
	  this.a=a;
	  this.d=d;
	  this.name=name;
	  System.out.println(this.a+" "+this.d+" "+this.name);
  }
public static void main(String[] args) {
	ex1 e=new ex1();
	e.display(10, 15,"");
}
}
