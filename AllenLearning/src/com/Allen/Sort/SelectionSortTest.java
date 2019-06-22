package com.Allen.Sort;



public class SelectionSortTest implements SelectionSort {

	public static void main(String[] args) {

		Integer a[] = {6, 9, 3, 7, 10, 5, 4, 8, 2, 1, 0};
		String b[] = {"d", "a", "b", "c", "f", "e"};

		SelectionSortTest test5 = new SelectionSortTest();
		test5.Sort(a);
		for (Integer i : a) {
			System.out.print(i + "\t");
		}
		test5.Sort(b);
		for (String i : b) {
			System.out.print(i + "\t");
		}
	}


	public <T extends Comparable<T>> void Sort(T[] a) {
		int minIndex = 0;
		for (int i = 0; i < a.length - 1; i++) {
			minIndex = i;// 无序区的最小数据数组下标
			for (int j = i + 1; j < a.length; j++) {
				// 在无序区中找到最小数据并保存其数组下标
				if (a[j].compareTo(a[minIndex]) < 0) {
					minIndex = j;
				}
			}
			// 将最小元素放到本次循环的前端
			T temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
	}

	public <T extends Comparable<T>> void Sort2(T[] a) {
		int minindex = 0;
		for (int i = 0; i < a.length - 1; i++) {
			minindex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(a[minindex]) < 0) {
					minindex = j;
				}
			}
			T temp = a[i];
			a[i] = a[minindex];
			a[minindex] = temp;
		}
	}


}
