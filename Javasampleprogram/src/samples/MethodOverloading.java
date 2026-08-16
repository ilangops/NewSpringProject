package samples;
class Overload{
		int num1;
		int num2;
		int result;
		
		void sum(int a, int b)
		{
			num1=a;
			num2=b;
			result=num1+num2;
			System.out.println(result);
		}
		void sum(double a,double b)
		{
			num1=(int)a;
			num2=(int)b;
			result=num1+num2;
			System.out.println(result);
		}
			
		
		void sum(int a,double b)
		{
			
			num1=a;
			num2=(int)b;
			result=num1+num2;
			System.out.println(result);
		
	}}
	public class MethodOverloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overload ov=new Overload();
ov.sum(10, 10);;
ov.sum(13.4,34.8);
ov.sum(5, 20.3);
		
		
	}

}
