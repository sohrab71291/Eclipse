package Inheritance;

public class Child extends Parent {
	

public static void main(String[] args)

{

Parent x = new Parent();
x.Automobiles();

Child y = new Child();
y.cars();

Parent z = new Parent();
z.Automobiles();
z.industry();

	
}
	
public void cars()

{
	System.out.println("THis is method of Child class");
}

}
