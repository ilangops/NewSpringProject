package samples;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//1.Create a new file 
		File obj=new File("demo.txt");
		obj.createNewFile();
		
		//2.Writing
	String sh[]= {"Welcome","All","Offyou"};
		FileOutputStream fos=new FileOutputStream(obj);
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeUTF("Welcome");
		System.out.println("Message Written Successfully ");
		
		for (String str:sh)
		
			dos.writeUTF(str);
			
	//3.Reading the file
	//ReadUTF

	
	
	FileInputStream fis=new FileInputStream(obj);
	DataInputStream dis=new DataInputStream(fis);
	while (dis.available()>0)
	{
		String line=dis.readUTF(dis);
		System.out.println(line);
	}
	if(obj.exists())
	{
		System.out.println("File name " +obj.getName());
		System.out.println("File name " +obj.getAbsolutePath());
		System.out.println("File name " +obj.length());
	}
	else
	{
		System.out.println("No file exist");
	}
	//4.Deleting the file
	obj.delete();
	//dos.close();
	//dis.close();
	}
	

}
