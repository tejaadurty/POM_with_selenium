package Java_Programs;

import org.apache.commons.exec.util.StringUtils;

public class Removewhitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S= "The Engineer is engineer";
		
		String a="";
		
		
		//System.out.println(S.trim());
		//System.out.println(S.replaceAll("\\s+", ""));
		
		for(int i=0; i<S.length();i++)
		{
			if(S.charAt(i)!=' ')
			{
				a=a+S.charAt(i);
			}
		}
		System.out.println(a);
	
		
		
		
		
	}

}
