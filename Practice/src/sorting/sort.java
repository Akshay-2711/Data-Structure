package sorting;

public class sort 
{
	public static boolean bubble(int arr[])
	{	
		int size=arr.length-1;
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return true;
	}
	
	public static void selectionSort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int index=i;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[index])
					index=j;
			}
			
			if(index!=i)
			{
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
			}
		}
	}
		
	public static void insertion(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j!=i;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
    }
	
	
	public static void quickSort(int arr[],int low,int high)
	{
		int mid=(low+high)/2;
		int i=low;
		int j=high;
		int pivot=arr[mid];
		
		while(i<=j)
		{
			while(arr[i]<pivot)
			{
				i++;
			}
			while(arr[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		
		if(low<j)
			quickSort(arr, low, j);
		
		if(high>i)
			quickSort(arr,i,high);
		
	}
	
	public static void mergeSort(int arr[],int numberOfEle)
	{
		if(numberOfEle<2)
			return;
		
		int mid=numberOfEle/2;
		int leftarr[]=new int[mid];
		int rightarr[]=new int[numberOfEle-mid];
		
		for(int i=0;i<mid;i++)
		{
			leftarr[i]=arr[i];
		}
		
		for(int i=mid;i<numberOfEle;i++)
		{
			rightarr[i-mid]=arr[i];
		}
		
		mergeSort(leftarr, mid);
		mergeSort(rightarr, numberOfEle-mid);
		
		merge(arr,leftarr,rightarr,mid,numberOfEle-mid);
		
	}
	public static void merge(int arr[],int[] leftarr,int[] rightarr,int left,int right)
	{
		int i=0,j=0,k=0;
		
		while(i<left && j<right)
		{
			if(leftarr[i]<=rightarr[j])
			{
				arr[k]=leftarr[i];
				i++;
			}
			else
			{
				arr[k]=rightarr[j];
				j++;
			}
			k++;
		}
		while(i<left)
		{
			arr[k]=leftarr[i];
			i++;
			k++;
		}
		while(j<right)
		{
			arr[k]=rightarr[j];
			j++;
			k++;
		}
	}
}
