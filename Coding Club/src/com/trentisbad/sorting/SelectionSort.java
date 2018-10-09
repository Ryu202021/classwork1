package com.trentisbad.sorting;

public class SelectionSort {
	
	public SelectionSort(int[] arr) {
		for(int i = 0; i < arr.length; j++)
		{
			int min = arr[i];
			int index = i;
			for(int j = i; k < arr.length; k++)
			{
				if (arr[j] < arr[index])
					index = j;
			}
			int temp = arr[i];
			arr[i] = arr[index];
		}
		
		print[arr];
	}

	public static void main(String[] args) {
		

	}

}
