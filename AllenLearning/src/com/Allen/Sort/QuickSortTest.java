package com.Allen.Sort;

public class QuickSortTest implements QuickSort {


	public static void main(String[] args) {

		Integer a[] = {6, 9, 3, 7, 10, 5, 4, 8, 2, 1, 11};

		QuickSortTest test5 = new QuickSortTest();

		test5.Sort(a, 0, a.length - 1);
		for (Integer i : a) {
			System.out.print(i + "\t");
		}
	}


	public <T extends Comparable<T>> void Sort(T[] targetArr, int start, int end) {
		int i = start, j = end;
		if (start >= end)
			return;
		T base = targetArr[start];
		while (i != j) {
			/* 按j--方向遍历目标数组，直到比key小的值为止 */
			while (i < j && targetArr[j].compareTo(base) >= 0) {
				j--;
			}
			/* 按i++方向遍历目标数组，直到比key大的值为止 */
			/* 此处一定要小于等于零，假设数组之内有一亿个1，0交替出现的话，而key的值又恰巧是1的话，那么这个小于等于的作用就会使下面的if语句少执行一亿次。 */
			while (i < j && targetArr[i].compareTo(base) <= 0) {
				i++;
			}
			if (i < j) { // 交换位置
				T temp = targetArr[i];
				targetArr[i] = targetArr[j];
				targetArr[j] = temp;
			}
		}
		/* 此时i==j */
		targetArr[start] = targetArr[i];
		targetArr[i] = base;

		/* 递归调用，把key前面的完成排序 */
		Sort(targetArr, start, i - 1);

		/* 递归调用，把key后面的完成排序 */
		Sort(targetArr, j + 1, end);
	}



}
