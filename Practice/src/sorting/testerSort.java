package sorting;

import java.util.Arrays;

public class testerSort {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		int arr[]= {25,12,61,45,50,1,65,9,87,5};
		sort b=new sort();
		//System.out.println(arr.length);
		//b.bubble(arr);
		//System.out.println(Arrays.toString(arr));
		
//		b.selectionSort(arr);
//		System.out.println(Arrays.toString(arr));
		
//		b.insertion(arr);
//		System.out.println(Arrays.toString(arr));
		
//		b.quickSort(arr, 0, arr.length-1);
//		System.out.println(Arrays.toString(arr));
		
		b.mergeSort(arr,arr.length);
		System.out.println(Arrays.toString(arr));
		
	}

}
