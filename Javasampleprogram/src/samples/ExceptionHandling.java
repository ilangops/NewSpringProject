package samples;

public class ExceptionHandling {

	
	public void slave()
	{
		try{
			throwsDemo(); 
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void throwsDemo() throws Exception
	{
		
		String str=null;
		System.out.println(str.length());
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
ExceptionHandling obj=new ExceptionHandling();
obj.slave();
	
	try {
	
		int a=5/0; throw new ArithmeticException();
		
	}catch(ArithmeticException e)
	{
		System.out.println("Hii" +e);
	}
	}	
	

}
