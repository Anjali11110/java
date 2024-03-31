package Methods;
class earth{
	void display(String a) {
		System.out.println("i am nonstatic from another class"+a);
	}
}

public class nonstatic_with_param {
	 void display(String a) {
		System.out.println("i am nonstatic method"+a);
	 }

	public static void main(String[] args) {
		nonstatic_with_param p=new nonstatic_with_param();
		earth s= new earth();
        p.display("Anjali");
        s.display("Sneha");
	}

}
