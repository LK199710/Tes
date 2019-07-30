/**
 * 
 */
package cn.edu.hunau.liuyi;

/**
 * @author likang
 *2019обнГ10:32:17
 */
public class TestMyStack{
	
	public static void main(String[] args) {
		MyStack my = new MyStack();
		
		my.addElment("Hello");
		my.addElment("world");
		my.addElment("java");
		while(!my.IsEmpty()){
		System.out.println(my.get());
			
		}
	}
}
