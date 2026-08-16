package samples;

class Parent extends Grandfather
{
	int a;
	Parent()
	{
		System.out.println("Parent constructor");
	}
	void show()
	{
		System.out.println("Hello Parent");
		}
	Parent(int b)
	{
		System.out.println("Child constructor" +b*5);
		
	}
	
}
class Child extends Parent
{
	int b;
	
	Child()
	{
		System.out.println("Child constructor");
	}
	Child(int a)
	{
		super(a*2);
		System.out.println("Child constructor" +a*3);
		
	}
	void display()
	{
		System.out.println("Hello Child");
	}
}
class Grandfather
{
	int g;
	void displayay()
	{
		System.out.println("Grand parent");
	}
	
	Grandfather()
	{
		System.out.println("Grandfather constructor");
	}
}

public class InheritanceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c= new Child();
		c.b=30;
		c.a=10;
		c.g=50;
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.g);
		c.display();
		c.displayay();
		c.show();
		Child c1= new Child(45);
	}

}
