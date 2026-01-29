/******************************************************************************

Eura Pulliam
1.29.26
LAB: Testing Objects

*******************************************************************************/

public class Dog {

    // Private instance variables (fields)
    private String name;
    private int age;
    private String breed;

    // No-argument (default) constructor
    public Dog() {
        name = "Unknown";
        age = 0;
        breed = "Mixed";
    }

    // Parameterized constructor
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Simple validation rule
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Override toString() for readable output
    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age + ", breed='" + breed + "'}";
    }
}