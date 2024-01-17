package com.kn.selection;

public class Arrays {
	public static void swap(int[] arr, int start, int end) {
		int temp = arr[end];
		arr[end] = arr[start];
		arr[start] = temp;
	}

	public static void quick(int[] arr, int start, int end) {
		if (start > end)
			return;
		int pi = partition(arr, start, end);
		quick(arr, start, pi - 1);
		quick(arr, pi + 1, end);
	}

	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[start];
		int count = 0;
		for (int i = start+1; i <= end; i++) {
			if (arr[i] <= pivot) {
				count++;
			}
		}
		int pivotindex = start + count;
		swap(arr, start, pivotindex);
		int i = start, j = end;
		while (i < pivotindex && j > pivotindex) {
			while (arr[i] <= pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i < pivotindex && j > pivotindex) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		return pivotindex;
	}

	public static void main(String[] args) {
		int[] arr = {10,9,8,7,6,5,4,3,2,1};
		int start = 0, end = arr.length - 1;
		quick(arr, start, end);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
