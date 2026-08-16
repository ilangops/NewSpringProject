package samples;


class Outer{
	
		public void getAccess()
		{
			class Inner{
				public void show()
				{
			System.out.println("Display method");
		}
	}
			Inner in=new Inner();
			in.show();

		}

}
public class InnerclassExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//in.show();	
				//Outer.Inner obj=new Outer.Inner();
				//obj.show();
	}
}

