__________________________________________________________________________________________________________________________________________
Eura Pulliam
1.29.26
LAB: Testing Objects
__________________________________________________________________________________________________________________________________________
1. Before toString, what printed when you printed an object? Why?
When printing an object without overriding `toString()`, Java prints the class name followed by a hexadecimal hash code (e.g., `Dog@1b6d3586`). This comes from the default `Object.toString()` method.
2. List your class’s three fields and their default values before you set anything.
`name` (String, reference type) → `null`
`age` (int, primitive) → `0`
`breed` (String, reference type) → `null`
3. What changed after you added the default constructor? After adding the parameterized constructor?
Constructors allow objects to start with meaningful values instead of Java’s default values. A parameterized constructor lets us initialize fields immediately with specific data.
4. Why add @Override to toString()?
The output became human-readable instead of a memory-style reference. `@Override` ensures the method correctly replaces the superclass method and catches errors at compile time.
5. Why is encapsulation (private fields + getters/setters) preferred over public fields? Give one concrete validation rule you could add to a setter.
Private fields protect data integrity. For example, a setter can prevent a negative age or price from being assigned, which wouldn’t be possible with public fields.