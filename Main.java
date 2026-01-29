/******************************************************************************

Eura Pulliam
1.29.26
LAB: Testing Objects

*******************************************************************************/

public class Main {
    public static void main(String[] args) {

        // ===== PART A: Object with no toString =====
        Dog dog1 = new Dog();
        System.out.println("Printing dog1 directly:");
        System.out.println(dog1);

        // ===== PART B: Default field values =====
        Dog d1 = new Dog();
        System.out.println("\nDefaults for d1 fields (before any assignment):");
        System.out.println("name = " + d1.getName());
        System.out.println("age = " + d1.getAge());
        System.out.println("breed = " + d1.getBreed());

        // ===== PART C: Constructors =====
        Dog d2 = new Dog();
        System.out.println("\nd2 after default constructor:");
        System.out.println(d2);

        Dog d3 = new Dog("Rex", 4, "Collie");
        System.out.println("\nd3 after parameterized constructor:");
        System.out.println(d3);

        // ===== PART D: toString() =====
        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        // ===== PART E: Encapsulation =====
        System.out.println("\nMutating via setters after making fields private:");
        d3.setAge(6);
        d3.setName("Maxwell");
        d3.setBreed("Border Collie");

        System.out.println("d3 age via getter = " + d3.getAge());
        System.out.println("d3 now = " + d3);

        // ===== Student-defined class test =====
        Book book1 = new Book();
        Book book2 = new Book("1984", "George Orwell", 328, 9.99, true);

        System.out.println("\nBook objects:");
        System.out.println(book1);
        System.out.println(book2);
    }
}
