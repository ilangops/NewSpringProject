package samples;

public class StringClassExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Hellow";
		
		String str=new String("abce");
		System.out.println(str);
		System.out.println(str1);
		str1="Welcome";
		System.out.println(str1.length());
		System.out.println(str1.indexOf('l'));
		System.out.println(str1.charAt(3));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.concat("World"));
		String s1="Hellow";
		String s2="Hellow";
		String s3=new String("Hellow");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	System.out.println(s1.compareTo(s3));
	String str4="  Work   ";
	str4=str4.trim();
			//System.out.println();
			System.out.println(str4.length());
			String str5=str4.replace("or","erk");
	System.out.println(str5);
	System.out.println(str5.substring(0,3));
	System.out.println(str5.contains("er"));
	String str6="Welcome-to-all";
	String[] str7=str6.split("-");
	for(String temp:str7)
	{
		System.out.println(temp);
	}
	String str8="klsdlfjdl";
	char ch6[]=str8.toCharArray();
	for(char temp1:ch6)
	{
		System.out.println(temp1);
	}
	
	}

}
