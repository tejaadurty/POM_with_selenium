package Java_Programs;

import java.util.Arrays;

public class twostrings_anagrams {

	public static void main(String[] args) {

		
		String s1= "Mary";
		String s2= "army";
		s1=s1.toLowerCase();
		System.out.println(s1);
		s2=s2.toLowerCase();
		System.out.println(s2);
		
	char [] firstchararray= s1.toCharArray();
	char [] secondchararray=s2.toCharArray();
	
	Arrays.sort(firstchararray);
	Arrays.sort(secondchararray);
	
	System.out.println(firstchararray);
	System.out.println(secondchararray);
	
System.out.println(Arrays.equals(firstchararray, secondchararray));

}
}
