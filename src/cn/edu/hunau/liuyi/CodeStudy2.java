/**
 * 
 */
package cn.edu.hunau.liuyi;

import java.util.Scanner;

/**
 * @author likang
 *2019����8:46:42
 */
public class CodeStudy2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("������Ҫ��ӡ��n");
		int n =sc.nextInt();
		
		if(n>9){
			System.out.println("�������ֵ������Χ");
			
		}else{
			PrintNN(n);
		}

	}
	public static void PrintNN(int n){
		for(int x=1;x<=n;x++){
			for(int y=1;y<=x;y++){
				System.out.print(y+"*"+x+"=" + y*x+"\t");
			}
			System.out.println();
		}
	}

}
