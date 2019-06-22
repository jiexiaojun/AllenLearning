package com.Allen.Sort;

public class BubbleSortTest implements BubbleSort {

	public static void main(String[] args) {

		Integer a[] = {6, 9, 3, 7, 10, 5, 4, 8, 2, 1, 0};
		String b[] = {"d", "a", "b", "c", "f", "e"};

		BubbleSortTest test5 = new BubbleSortTest();

		test5.Sort(a);
		for (Integer i : a) {
			System.out.print(i + "\t");
		}

		test5.Sort(b);
		for (String s : b) {
			System.out.print(s + "\t");
		}
	}


	public <T extends Comparable<T>> void Sort(T[] list) {
		boolean flag = true;
		for (int i = 0; i < list.length - 1 && flag; i++) {
			flag = false;
			for (int j = 0; j < list.length - 1; j++) {
				if (list[j].compareTo(list[j + 1]) > 0) {
					T temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					flag = true;
				}
			}
		}
	}


}
