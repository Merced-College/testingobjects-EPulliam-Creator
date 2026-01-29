public class Dog {

    // Fields (now private)
    private String name;
    private int age;
    private String breed;

    // Default constructor
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
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age >= 0) this.age = age;
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age + ", breed='" + breed + "'}";
    }
}
