package samples;

class Test
{
	void test()
	{
		System.out.println("In old test");
	}
	
}
public class AnonymaseInnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test obj=new Test()
				{
			public void test()
			{
				System.out.println("In new test");
			}
				};
				obj.test();

}
}