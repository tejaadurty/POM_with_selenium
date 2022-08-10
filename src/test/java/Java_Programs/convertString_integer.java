package Java_Programs;

import java.util.Enumeration;
import java.util.Vector;

public class convertString_integer {

	public static void main(String[] args) {
		/*
		 * String str= "122222";
		 * 
		 * System.out.println(str);
		 * 
		 * int res= Integer.parseInt(str);
		 * 
		 * System.out.println(res);
		 */
		
		
		Vector <String> v= new Vector<String>();
		
		v.addElement("rr");
		v.addElement("tt");
		
		Enumeration e= v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		

	}

}
