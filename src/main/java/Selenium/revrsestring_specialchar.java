package Selenium;

public class revrsestring_specialchar {

	public static void main(String[] args) {
		
		String str= "ay@ush";
	char [] ch= str.toCharArray();
	reverse(ch);
	
	String  revstr= new String(ch);
	System.out.println(revstr);	
		
	}
	public static void reverse(char str[]) {
			
		int len= str.length;  
		
	int r= len-1; 
	int l=0;
	
	while(l<r) {
		
		
		if(!Character.isAlphabetic(str[l]))
		{
			l++;
		}
		else if(!Character.isAlphabetic(str[r]))
		{
			r--;
		}
		
	 char temp= str[l];
		str[l]=str[r];
		str[r]= temp;
		l++;
		r--;
		
	}
	
	
	
	
		
		
	}
}
