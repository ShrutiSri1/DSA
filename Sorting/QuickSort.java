
import java.io.*;

class QuickSort{
	static void swap(int[] arr, int i, int j)
{
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}

static int partition(int[] arr, int low, int high)
{
	
	
	int pivot = arr[low];
  int i=low;
  int j=high;
	while(i<j)
	{
		
		do{
      i++;
    }while(arr[i]<=pivot);
    do{
      j--;
    }while(arr[j]>pivot);
    if(i<j)
			swap(arr, i, j);
		}
	}
	swap(arr, low, j);
	return j;
}

static void quickSort(int[] arr, int low, int high)
{
	if (low < high)
	{
		
		int pi = partition(arr, low, high);
		quickSort(arr, low, pi - 1);
		quickSort(arr, pi + 1, high);
	}
}

