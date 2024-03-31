package Methods;
 class demo{
	static void display() {
		System.out.println("i am static from another class");
	}
}
public class static_without_param {
	static void display() {
		System.out.println("i am static method");
	}

	public static void main(String[] args) {
		display();
        demo.display();
	}

}
