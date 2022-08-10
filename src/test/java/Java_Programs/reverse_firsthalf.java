package Java_Programs;

public class reverse_firsthalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,2,5,4,6,9,5,3};

		int len=arr.length;
		
		for (int i=0; i<len/4;i++)
		{
			int t= arr[i];  //10
			arr[i]=arr[len/2-i-1];
			arr[len/2-i-1]=t;
		}
		

        for(int j=0; j<len; j++)

        {

            System.out.println(arr[j]);

        }
	}

}
