
/**
 *ʵ����������� 
 */
package cn.edu.hunau.liuyi;

/**
 * @author likang
 *2019����2:38:51
 */
public class CodeStudy3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//��̬��ʼ��һ������
    	int []a = {22,33,44,55,66};
    	reverse(a);
    	printArray(a);
		
	}//����һ��ʵ�ַ���
    public static void reverse(int [] arr ){
    	
    	//int temp = arr[0]; arr[0]=arr[arr.length-1];arr[arr.length-1]=temp;����arr.length/2��
    	for(int x =0;x<arr.length/2;x++){
    		int temp = arr[x];
    		arr[x] = arr[arr.length-1-x];
    		arr[arr.length-1-x]=temp;
    	}
    	
    	
    	
    }//����һ������
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
