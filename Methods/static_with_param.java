package Methods;
class moon{
	static void display(String a) {
		System.out.println("i am static from another class"+a);
	}
}

public class static_with_param {
	static void display(String a) {
		System.out.println("i am static method"+a);
	}

	public static void main(String[] args) {
	display("Anjali");
	moon.display("Esha");	
		
	}

}
