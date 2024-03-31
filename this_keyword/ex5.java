package this_keyword;

public class ex5 {
	private int value;

    // Constructor with one argument
    public ex5(int value) {
        this.value = value;
    }

    // Constructor with no argument, which invokes the constructor with one argument
    public ex5() {
        this(0); // Calling another constructor within the same class and passing this as an argument
    }

    // Method to display the value
    public void display() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        ex5 obj1 = new ex5(10); // Creating object with value 10
        obj1.display(); // Displaying value

        ex5 obj2 = new ex5(); // Creating object with default value (0)
        obj2.display(); // Displaying value
    }
}
