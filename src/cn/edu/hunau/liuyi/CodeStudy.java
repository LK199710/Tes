/**
 * 
 */
package cn.edu.hunau.liuyi;

import java.util.Scanner;

/**
 * @author likang
 *2019����8:40:07
 */
public class CodeStudy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("����������");
		int m =sc.nextInt();
		System.out.println("����������");
		
		int n  =sc.nextInt();
		PrintXing(m,n);
		
	}
	public static void PrintXing(int m,int n ){
		for(int x=0;x<m;x++){
			for(int y=0;y<n;y++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
