package Methods;
class sun{
	void display() {
		System.out.println("i am nonstatic from another class");
	}
}

public class nonstatic_without_param {
	 void display() {
		System.out.println("i am nonstatic method");
	 }

	public static void main(String[] args) {
		nonstatic_without_param p=new nonstatic_without_param();
		sun s= new sun();
        p.display();
        s.display();
	}

}
