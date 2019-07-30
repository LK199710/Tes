/**
 * 
 */
package cn.edu.hunau.liuyi;

import java.util.Scanner;

/**
 * @author likang
 *2019上午8:46:42
 */
public class CodeStudy2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入要打印的n");
		int n =sc.nextInt();
		
		if(n>9){
			System.out.println("您输入的值超过范围");
			
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
