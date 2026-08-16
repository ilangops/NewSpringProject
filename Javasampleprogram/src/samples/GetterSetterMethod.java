package samples;

public class GetterSetterMethod {
	
	private int id;
	public int getId() {
		return  id;
		
	}

	public void setId(int id) {
		this.id = id;
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
		System.out.println(mark);
	}

	private String name;
	private double mark;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GetterSetterMethod gs=new GetterSetterMethod();
		gs.setId(10001);
		gs.getId();
		//System.out.println(gs.getid());
		gs.setName("Ramkumar");
		gs.setMark(1002.22);
	}

}
