package super_keyword;
class demo{
	protected String name;
	void display(String name) {
		this.name=name;
		System.out.println(name);
		System.out.println(this.name);
	}
	
}
class super_variable extends demo{
	void display(){
		System.out.println(super.name);
		System.out.println(this.name);
		super.display("anu");
	}
	
	public static void main(String[] args) {
		super_variable sv=new super_variable();
		sv.display();
		}
}
