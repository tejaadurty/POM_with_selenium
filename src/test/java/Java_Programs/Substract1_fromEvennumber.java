package Java_Programs;

import java.util.ArrayList;
import java.util.List;

public class Substract1_fromEvennumber {

	public static void main(String[] args) {
		int [] inta= {1,2,3,4,5};
		//int sub=0;
		
		List<Integer> intb= new ArrayList<Integer>();
		
		
		for(int i=0;i<inta.length;i++)
		{
			if(inta[i]%2==0)
			{
			int sub= inta[i]-1;
			intb.add(sub);
			}
			else {
				intb.add(inta[i]);}	
			
		}
		
		System.out.println(intb);

	}

}
