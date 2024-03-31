package this_keyword;

public class ex4 {
	  private int value;

	    public ex4(int value) {
	        this.value = value;
	    }

	    public void process() {
	        System.out.println("Processing object with value: " + value);
	    }

	    public void callAnotherMethod() {
	        // Passing 'this' as an argument to another method
	        anotherMethod(this);
	    }

	    public void anotherMethod(ex4 obj) {
	        System.out.println("Received object with value: " + obj.value);
	        // You can perform further operations on 'obj' if needed
	        obj.process(); // Calling a method of the passed object
	    }

	    public static void main(String[] args) {
	        ex4 obj = new ex4(10);
	        obj.callAnotherMethod();
	    }
}
