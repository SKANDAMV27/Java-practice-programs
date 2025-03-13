// Class definition for 'person'
class person {
    // Private instance variables
    private int age;
    private String name;

    // Default constructor
    public person() {
        age = 18; // Initializing age to 18
        name = "Skanda"; // Initializing name to "Skanda"
    }

    // Method to display the values of age and name
    public void display() {
        System.out.println("Constructor!"); // Message indicating constructor execution
        System.out.println("AGE: " + age + " NAME: " + name); // Printing the values
    }
}

// Main class to test the 'person' class
class defultconsttructor {
    public static void main(String[] args) {
        // Creating an object of class 'person'
        person obj = new person();
        
        // Calling display method to print the values
        obj.display();
    }
}
