

import java.util.*;
import java.lang.*;
import java.io.*;

class Alpha
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char c;
	
		
		Scanner s=new Scanner(System.in);
		c=s.next().charAt(0); 
		
		if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
		{
		System.out.println("Alphabet");
		}
		else
		{
			System.out.println("No");
		}

	
}
}
		
		
	
