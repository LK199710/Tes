/**
 * 
 */
package cn.edu.hunau.liuyi;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author likang
 *2019上午10:37:23
 */
public class YearTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		Calendar c = Calendar.getInstance();
		c.set(year,2,1);   
		c.add(Calendar.DATE, -1);
		int d= c.get(Calendar.DATE);
		System.out.println(year+"年的二月有"+d+"天");
		
		
		
	}

}
