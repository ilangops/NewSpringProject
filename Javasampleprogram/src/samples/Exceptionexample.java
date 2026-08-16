package samples;
//Try,catch,throw,throws,finally
public class Exceptionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			int a=5/1;
			System.out.println("Hii");
			try{
				int c[]= {5};
				c[0]=25;
					
			}catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Inner try exception" +e);
		}
		catch(ArithmeticException e)
		{
		System.out.println("OutterException" +e);}
		}
	finally	
	{
	System.out.println("No exeption raised");
	}
	}
}
