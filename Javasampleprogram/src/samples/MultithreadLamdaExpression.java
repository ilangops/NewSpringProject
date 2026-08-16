package samples;

public class MultithreadLamdaExpression {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new Thread(() ->
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println("Hi");
				try {Thread.sleep(1000);}
				catch(Exception e) {}
			}
		});
		t1.start();
		try{Thread.sleep(1000); 
		}catch(Exception e) 
		{}
			Thread t2=new Thread(() ->
			{
				for(int i=0;i<=5;i++)
				{
					System.out.println("Hello");
					try {Thread.sleep(1000);}
					catch(Exception e1) {}
				}
			});
			t2.start();
			System.out.println(t1.getPriority());
			t1.join();
			System.out.println(t2.getPriority());
			t2.join();
			t1.getName();
			System.out.println("Good evening");
	}

}
