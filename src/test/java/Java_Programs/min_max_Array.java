package Java_Programs;

public class min_max_Array {

	public static void main(String[] args) {
		int [] arr= {2,4,5,6,1,90,3};
		int min=arr[0];
		int max=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min= arr[i];
			}
		}
		System.out.println(min);
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max= arr[i];
			}
		}
		System.out.println(max);
	}

}
