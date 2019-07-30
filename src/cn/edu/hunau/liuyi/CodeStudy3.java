
/**
 *实现数组的逆序 
 */
package cn.edu.hunau.liuyi;

/**
 * @author likang
 *2019下午2:38:51
 */
public class CodeStudy3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//静态初始化一个数组
    	int []a = {22,33,44,55,66};
    	reverse(a);
    	printArray(a);
		
	}//创建一个实现方法
    public static void reverse(int [] arr ){
    	
    	//int temp = arr[0]; arr[0]=arr[arr.length-1];arr[arr.length-1]=temp;交换arr.length/2次
    	for(int x =0;x<arr.length/2;x++){
    		int temp = arr[x];
    		arr[x] = arr[arr.length-1-x];
    		arr[arr.length-1-x]=temp;
    	}
    	
    	
    	
    }//遍历一个数组
    public static void printArray(int [] arr){
    	System.out.print("[");
    	for(int x=0;x<arr.length;x++){
    		if(x==arr.length-1){
    			System.out.println(arr[x]+"]");
    		}else{
    			System.out.print(arr[x]+",");
    		}
    	}
    }
}
