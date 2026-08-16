package samples;

class Parent1 extends Grandfather1
{
	int a=10;
	
	void display()
	{
		System.out.println("Hello Parent");
		}
	
}
class Child1 extends Parent1
{
	int b=10;
	
	void display()
	{
		System.out.println("Hello Child" +b);
		System.out.println(+super.a);
	}
}
class Grandfather1
{
	int g;
	void display()
	{
		System.out.println("Grand parent");
	}
	
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child1 c= new Child1();
		/*c.b=30;
		c.a=10;
		c.g=50;
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.g);*/
		c.display();
			
	}

}
