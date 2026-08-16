package samples;

	class A extends Thread
	
	{
		public void run()
		{
			for (int i=0;i<=5;i++)
			{
				System.out.println("Hi");
				try{Thread.sleep(500); 
				}catch(Exception e) {
					e.printStackTrace();
			}
			}
		}

		
	}
class B extends Thread
	
	{
		public void run()
		{
			for (int i=0;i<=5;i++)
			{
				System.out.println("Hello");
				try{Thread.sleep(500); 
				}catch(Exception e) {
					e.printStackTrace();
			}
			}
		}
	}

public class MultithreadExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a=new A();
		B b=new B();
		a.start();
		b.start();
		
	}

}
