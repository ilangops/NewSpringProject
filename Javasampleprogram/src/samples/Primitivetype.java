package samples;

import java.util.Scanner;

	public class Primitivetype{
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row=4;
		int col=4;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				
				if(i==0 || i==row-1 || j==0 | j==col-1)
				System.out.print("*");
				else System.out.print(" ");
				}
			System.out.println();
		}
	}
	}
