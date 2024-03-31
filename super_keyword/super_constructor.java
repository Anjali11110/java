package super_keyword;
class moo{
	moo(){
		System.out.println("hii");
	}
}
public class super_constructor extends moo {
	public super_constructor() {
		super();
		System.out.println("Anjali");
	}
	public static void main(String[] args) {
		super_constructor sc=new super_constructor();
		
		}

}
