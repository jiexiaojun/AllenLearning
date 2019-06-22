package allen._41_50;


/*题目：打印出杨辉三角形（要求打印出10行如下图）*/
//	1	
//	1	1	
//	1	2	1	
//	1	3	3	1	
//	1	4	6	4	1	
//	1	5	10	10	5	1	
//	1	6	15	20	15	6	1	
//	1	7	21	35	35	21	7	1	
//	1	8	28	56	70	56	28	8	1	
//	1	9	36	84	126	126	84	36	9	1
public class Test41 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-7 下午03:53:19    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-7 下午03:53:19   
	 * 修改备注：    
	 * @version V1.0       
	 */
	public static void main(String args[]) {
        int i, j;
        int a[][];
        int n = 10;
        a = new int[n][n];
        for (i = 0; i < n; i++) {
            a[i][i] = 1;
            a[i][0] = 1;
        }
        for (i = 2; i < n; i++) {// 这个地方就是算法的所在   所求的数等于他正上方的数 加上 正上方左边的数
            for (j = 1; j <= i-1 ; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.printf(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
