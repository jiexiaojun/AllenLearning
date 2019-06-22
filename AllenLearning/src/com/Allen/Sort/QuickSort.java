package com.Allen.Sort;

// 快速排序
public interface QuickSort {

	public <T extends Comparable<T>> void Sort(T[] list, int start, int end);

}
