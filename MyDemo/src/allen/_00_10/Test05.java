package allen._00_10;

import java.util.Comparator;
/**
 * 
* 项目名称：testClass        
* 类名称：Test5    
* 类描述：冒泡排序
* 创建人：汪俊   
* 创建时间：2017-7-31 下午02:10:01    
* 修改人：汪俊  
* 修改时间：2017-7-31 下午02:10:01   
* 修改备注：    
* @version 1.0
 */
public class Test05 implements Test04   {

	public static void main(String [] args)
	{
//		Integer a[] = {1,2,3,4,5,6,7,8,9,10};
		Integer a[] = {10,9,8,7,6,5,4,3,2,1,0};
		Test05 test5 =  new Test05();
		test5.sort(a);
		for(int i=0;i<a.length;i++)
		{
//			System.out.println(a[i]);
		}
		
	}
	
	
    public <T extends Comparable<T>> void sort(T[] list) {
        boolean swapped = true;
        for (int i = 1, len = list.length; i < len && swapped; ++i) {
            swapped = false;
            for (int j = 0; j < len - i; ++j) {
                if (list[j].compareTo(list[j + 1]) > 0) {
                    T temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }
 
    public <T> void sort(T[] list, Comparator<T> comp) {
        boolean swapped = true;
        for (int i = 1, len = list.length; i < len && swapped; ++i) {
            swapped = false;
            for (int j = 0; j < len - i; ++j) {
                if (comp.compare(list[j], list[j + 1]) > 0) {
                    T temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }
    
    


}