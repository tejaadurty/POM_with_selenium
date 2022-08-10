import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class charctercount {

	public static void main(String[] args) {
		/*
		 * String s= "character";
		 * 
		 * char [] charray= s.toCharArray();
		 * 
		 * Map<Character,Integer> mp= new HashMap<Character,Integer>(); for(char c:
		 * charray) if(mp.containsKey(c)) { mp.put(c, mp.get(c)+1); } else {
		 * mp.put(c,1); }
		 * 
		 * System.out.println(mp);
		 */
				//String str="";
		//String str= "NaveenAtomationLabs1234";
		
		/*char [] chararay= s.toCharArray();
		for(Character ch: chararay) {
			if(!Character.isAlphabetic(ch)) {
		        String str = Character.toString(ch);
		        System.out.println(str);

				
			}*/
		
		/*
		 * str=str.replaceAll("[^\\d]"," "); str = str.trim(); System.out.println(str);
		 */
		
		/*
		 * str= str.substring(19); System.out.println(str);
		 */
		
		String [] str= {"ss","tt","yy","uu"};
		
		/*
		 * String s= Arrays.toString(str);
		 * 
		 * System.out.println(s);
		 */
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<str.length;i++)
		{
			sb.append(str[i]);
		}
		System.out.println(sb.toString());
	
		
		
		
		}
		
		
		
		
		
		

	}


