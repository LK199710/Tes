/**
ʵ�ָ��������е�һ�����ָ�������ݵ�����ֵ
 * 
 */
package cn.edu.hunau.liuyi;

/**
 * @author likang
 *2019����3:51:37
 */
public class ArrayIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��̬��ʼ��һ������
		int[] arr = {22,34,35,66,77,88,77};
		
	int a =	arrayIndex(arr,77);
	System.out.println(a);
		
		

	}
	//������ȷ 1.����ֵ���� int;2.�����б� int[]arr;int index;
	public static int arrayIndex (int [] arr,int index){
		//��������
		for(int x=0;x<arr.length;x++){
			if(index==arr[x]){
				return x;
			}
			 
		}
		return -1;
	}          

}
