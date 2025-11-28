package javaconcepts;
class A {
	void show () {
		System.out.println("A class using super class");
	}
}
class B extends A{
	
	void show () {
		
		
		System.out.println("B class");
	}
}
public class MethodOverride {

	public static void main(String[] args) {
		A a1 =new A();
		a1.show();
		A obj;
		obj=a1;
		obj.show();

	}
}	
