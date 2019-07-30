/**
实现给定数组中第一个出现给点的数据的索引值
 * 
 */
package cn.edu.hunau.liuyi;

/**
 * @author likang
 *2019下午3:51:37
 */
public class ArrayIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//静态初始化一个数组
		int[] arr = {22,34,35,66,77,88,77};
		
	int a =	arrayIndex(arr,77);
	System.out.println(a);
		
		

	}
	//两个明确 1.返回值类型 int;2.参数列表 int[]arr;int index;
	public static int arrayIndex (int [] arr,int index){
		//遍历数组
		for(int x=0;x<arr.length;x++){
			if(index==arr[x]){
				return x;
			}
			 
		}
		return -1;
	}          

}
