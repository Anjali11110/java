package this_keyword;

public class ex3 {
	private int myNumber;
    private String myString;

    // Constructor with parameters
    public ex3(int number, String str) {
        // Calling another constructor within the same class using this()
       this();
       this.display(); // This invokes the no-argument constructor
        this.myNumber = number;
        this.myString = str;
    }

    // No-argument constructor
    public ex3() {
        // Default initialization
        this.myNumber = 0;
        this.myString = "Default";
    }

    public void display() {
        System.out.println("Number: " + myNumber);
        System.out.println("String: " + myString);
    }

    public static void main(String[] args) {
        ex3 obj1 = new ex3(10,"AMU");
        obj1.display();

//        ex3 obj2 = new ex3();
//        obj2.display();
    }
}
