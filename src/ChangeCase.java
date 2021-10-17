import java.util.*;
class ChangeCase
{
	public static void main(String arg[])
	{
	Scanner ob=new Scanner (System.in);
	System.out.print("Enter any name: ");
	String name=ob.next();
	String printname="";
	
	for(byte x=0;x<(name.length());x++)
	{
	char ch=(char)(32+name.charAt(x));
		printname+=ch;
	}
	System.out.print(printname);
	}

}