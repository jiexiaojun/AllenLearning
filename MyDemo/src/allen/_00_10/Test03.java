package allen._00_10;
import java.util.Comparator;

import org.springframework.util.comparator.ComparableComparator;
/**
* 项目名称：testClass        
* 类名称：Test3    
* 创建人：汪俊   
* 创建时间：2017-7-31 上午10:27:36    
* 修改人：汪俊  
* 修改时间：2017-7-31 上午10:27:36   
* 修改备注：    
* @version 1.0
 */
public class Test03 {
		
	
	public static void main(String[] args) {

		Integer a[] = {1,2,3,4,5,6,7,8,9,10};	
		Test03 test3 =  new Test03();
		
		Integer b[]	= { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		
		Comparator<Integer> comp = new ComparableComparator<Integer>();
		


	}

	
//	   public  <T extends Comparable<T>> int binarySearch(T[] x, T key) {
//	      return binarySearch(x, 0, x.length- 1, key);
//	   }
	 
	   // 使用循环实现的二分查找
	   public  <T> int binarySearch(T[] x, T key, Comparator<T> comp) {
	      int low = 0;
	      int high = x.length - 1;
	      while (low <= high) {
	          int mid = (low + high) >> 1;
	          int cmp = comp.compare(x[mid], key);
	          if (cmp < 0) {
	            low= mid + 1;
	          }
	          else if (cmp > 0) {
	            high= mid - 1;
	          }
	          else {
	            return mid;
	          }
	      }
	      return -1;
	   }
	 
	   // 使用递归实现的二分查找
	   public <T extends Comparable<T>> int binarySearch(T[] x, int low, int high, T key) {
	      if(low <= high) {
	        int mid = low + ((high -low) >> 1);
	        if(key.compareTo(x[mid])== 0) {
	           return mid;
	        }
	        else if(key.compareTo(x[mid])< 0) {
	           return binarySearch(x,low, mid - 1, key);
	        }
	        else {
	           return binarySearch(x,mid + 1, high, key);
	        }
	      }
	      return -1;
	   }
	   
	   
		   public <T> int chazhao(T[]  x,T key,Comparator<T> comp) 
		   {
			   int low = 0;
			   int high = x.length -1 ;
			   while (low<=high) 
			   {
				   int mid = (low + high) >> 1;
			   int cmp = comp.compare(x[mid], key);
		          if (cmp < 0) {
		            low= mid + 1;
		          }
		          else if (cmp > 0) {
		            high= mid - 1;
		          }
		          else {
		            return mid;
		          }
			   }
			   return -1;
		  }
		   
		   public <T>  int chazhao1(T[] x,int low,int high,T key,Comparator<T> comp) 
		   {
			   if(low <= high) {
//			        int mid = low + ((high -low) >> 1);
				   int mid = (low + high) >> 1;
			        if(comp.compare(x[mid], key)==0) {
			           return mid;
			        }
			        else if(comp.compare(x[mid], key)>0) {
			           return chazhao1(x,low, mid - 1, key,comp);
			        }
			        else {
			           return chazhao1(x,mid + 1, high, key,comp);
			        }
			      }
			return -1;
		}

}
