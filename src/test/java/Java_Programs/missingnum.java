package Java_Programs;

public class missingnum {

	public static  void  main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,2,3,4,6};
		
		
		
		int num=missingnumber(a,6);
		System.out.println(num);
		
		
		
	}

	public static int missingnumber(int[] a, int totalcount) 
		// TODO Auto-generated method stub
		{
			int expsum= ((totalcount)*(totalcount+1))/2;
			
			int actsum=0;
			
			for(int i: a)
			{
				actsum=actsum+i;
			}
			
			return expsum-actsum;
		}
	

}