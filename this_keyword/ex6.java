package this_keyword;
public class ex6{
	private int value;
	
	public ex6(int value) {
		this.value=value;
	}
	public ex6 setvalue(int value) {
		this.value=value;
		 return this;
	}
	void display() {
		System.out.println("the value"+value);
	}
	public static void main(String[] args) {
		ex6 e=new ex6(10);
		e.display();
		e.setvalue(50);
		e.display();
	}
}