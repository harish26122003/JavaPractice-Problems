package miniproject;

//1. Encapsulation
class Product {
 private String name;
 private double price;

 // Constructor
 public Product(String name, double price) {
     this.name = name;
     this.price = price;
 }

 // Getter and Setter (Encapsulation)
 public String getName() {
     return name;
 }

 public double getPrice() {
     return price;
 }
}

//2. Abstraction
abstract class Payment {
 abstract void pay(double amount);  // abstract method
}

//Payment types (Abstraction + Polymorphism)
class CardPayment extends Payment {
 void pay(double amount) {
     System.out.println("Paid ₹" + amount + " using Credit/Debit Card");
 }
}

class UpiPayment extends Payment {
 void pay(double amount) {
     System.out.println("Paid ₹" + amount + " using UPI");
 }
}

//3. Inheritance
class User {
 String name;
 String email;

 public User(String name, String email) {
     this.name = name;
     this.email = email;
 }

 void displayUser() {
     System.out.println("User: " + name + " | Email: " + email);
 }
}

class Customer extends User {   // Customer inherits User
 String membershipType;

 public Customer(String name, String email, String membershipType) {
     super(name, email); // call parent constructor
     this.membershipType = membershipType;
 }

 // 4. Polymorphism (Method Overriding)
 @Override
 void displayUser() {
     System.out.println("Customer: " + name + " (" + membershipType + " Member)");
 }
}

//Main class
public class EcommerceDemo {
 public static void main(String[] args) {
     // Create product (Encapsulation)
     Product p1 = new Product("Laptop", 55000);

     // Create customer (Inheritance + Polymorphism)
     Customer c1 = new Customer("Harishraj", "harish@example.com", "Premium");

     // Display details
     c1.displayUser();
     System.out.println("Purchased: " + p1.getName() + " | Price: ₹" + p1.getPrice());

     // Choose payment (Abstraction + Polymorphism)
     Payment payment;

     payment = new CardPayment();
     payment.pay(p1.getPrice());

     payment = new UpiPayment();
     payment.pay(p1.getPrice());
 }
}
