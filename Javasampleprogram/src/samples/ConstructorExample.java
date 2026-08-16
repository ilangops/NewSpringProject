package samples;
 class ABCD {	
	
	int num1;
	int num2;
	int result;
	
	
	ABCD()
	{
		System.out.println("default constructor");
	}
	ABCD(int a,int b)
	{
		int num1=a;
		int num2=b;
		
		System.out.println("Paramaterized constructor");
		result=num1+num2;
		System.out.println(+result);
				
	}
 
	void display()
	{
	int result=num1+num2;
		System.out.println(+result);
	}
 }	
	public class ConstructorExample {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ABCD a1=new ABCD(30,40);
		a1.display();
		

	}
	}