package com.Allen.Sort;

// 冒泡排序
public interface BubbleSort {

	// 我倾向这种 只有一个参数
	public <T extends Comparable<T>> void Sort(T[] list);

}
