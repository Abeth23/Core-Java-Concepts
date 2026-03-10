# Core-Java-Concepts
OOPS, Collections, Streams, Exception handling, Multithreading basics, JVM basics, SOLID

# ☕ Core Java Concepts

A collection of Core Java concepts with practical code examples.

---

## 📚 OOP Concepts

### 1. OOP (Object Oriented Programming)
A programming paradigm that organizes code around objects (data + behavior) rather than functions and logic.

### 2. Class
A blueprint/template for creating objects. Defines what data and methods an object will have.

### 3. Object
A real instance of a class created in memory using the `new` keyword.

### 4. Encapsulation
Wrapping data and methods into a single unit (class) and restricting direct access using `private` + getters/setters.
> Data hiding — protect internal state and expose only what's necessary.

### 5. Inheritance
A child class acquires properties and methods of a parent class using `extends`, enabling code reuse.
> IS-A relationship — Car IS-A Vehicle.

### 6. Polymorphism
One method behaves differently based on the object or arguments.
- **Overriding** → Runtime polymorphism
- **Overloading** → Compile time polymorphism

### 7. Abstraction
Hiding implementation details and showing only essential features using `abstract` class or `interface`.
> Show what it does, not how it does it.

### 8. Interface
A 100% abstract contract — only method declarations, no body. A class can implement multiple interfaces.

---

## 📦 Collections

### ArrayList
Ordered list that allows duplicates. Backed by array — get by index is O(1).

### HashMap
Stores key-value pairs. Get/put is O(1) average using hashing.

### HashSet
Stores only unique values. Internally uses HashMap with dummy values.

---

## 📁 Project Structure
```
src/
├── Encapsulation/BankAccount.java
├── Inheritance/VehicleDemo.java
├── Abstraction/PaymentDemo.java
├── Polymorphism/AnimalDemo.java
└── Collections/
     ├── ShoppingCart.java
     ├── StudentMarks.java
     └── UniqueEmails.java
```
