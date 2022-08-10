package Java_Programs;

public class largestnum_array {

	public static void main(String[] args) {
		int [] intarr= {1,7,9,10,56,87,2,104};
		
		int large=0;
		
		for(int i=0;i<intarr.length;i++)
		{
			if(intarr[i]>large)
			{
				large= intarr[i];
			}
			
		}
		System.out.println(large);
		

	}

}
