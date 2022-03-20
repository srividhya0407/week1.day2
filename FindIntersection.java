package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		
		System.out.println(arr1.length);
		
		//length of the array is 6
		
		for(int i  = 0; i < arr1.length; i++)  //checking from i =0 to 5(less than length 6//
		{
			for(int j = 0; j< arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.println("intersection is" + arr1[i]);
				}
			}
		}

	}

}
