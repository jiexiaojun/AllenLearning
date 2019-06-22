package com.Allen.Sort;


public class BinarySearchTest implements BinarySearch {

	public static void main(String[] args) {
		Integer a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};// 必须是有序的 由小到大

		BinarySearchTest test5 = new BinarySearchTest();


		System.out.println(test5.Search(a, 3));

	}


	public <T extends Comparable<T>> int Search(T[] list, T key) {
		int low = 0;
		int high = list.length - 1;
		while (low <= high) {
			int mid = (low + high) >> 1; // 防止相加溢出
			int cmp = list[mid].compareTo(key);
			if (cmp < 0) {
				low = mid + 1;
			}
			else if (cmp > 0) {
				high = mid - 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}
