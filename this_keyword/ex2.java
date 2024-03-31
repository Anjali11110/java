package this_keyword;

public class ex2 {
	void m() {
		System.out.println("hii");
	}
	void f() {
		this.m();
		System.out.println("friends");
	}

	public static void main(String[] args) {
		ex2 e=new ex2();
		e.f();
		

	}

}
