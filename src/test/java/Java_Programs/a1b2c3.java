package Java_Programs;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class a1b2c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "aabbbcccc";
StringBuilder sb = new StringBuilder();
  char [] ch= s.toCharArray();

  System.out.println(ch.length);
  
  int count=1;
  for (int i=0;i<(ch.length)-1;i++)
  {
	if(ch[i]==ch[i+1])
	{
		count=count+1;
	}
	
	else {
		sb.append(ch[i]);
		sb.append(count);
		count=1;
		}
	if(i==(ch.length)-2) {
		sb.append(ch[i+1]);
		sb.append(count);
	
  
 }
  }
  System.out.println(sb.toString());

}
}

