// Class definition following proper naming conventions (Class names should start with uppercase)
class Person {
    // Private instance variables (Data Hiding - Encapsulation Principle)
    private int age;        
    private String name;    

    // Getter method for 'age' (Provides read access to 'age')
    public int getAge() {
        return age; 
    }

    // Setter method for 'age' (Provides controlled write access to 'age')
    public void setAge(int age) {
        this.age = age; // Assigns the parameter value to the instance variable
    }

    // Getter method for 'name' (Provides read access to 'name')
    public String getName() {
        return name;
    }

    // Setter method for 'name' (Provides controlled write access to 'name')
    public void setName(String name) {
        this.name = name; // Assigns the parameter value to the instance variable
    }
}

// Main class to test Encapsulation
class Encaplsulation1 {
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person obj = new Person();

        // Setting values using setter methods
        obj.setAge(14);
        obj.setName("Skanda");

        // Retrieving values using getter methods and printing them
        System.out.println("Name: " + obj.getName() + " Age: " + obj.getAge());
    }
}
