/**
 * 
 */
package cn.edu.hunau.liuyi;

import java.util.LinkedList;

/**
 * @author likang 2019ÏÂÎç10:14:50
 */
public class MyStack {
	private LinkedList link;
	public MyStack() {
		link = new LinkedList();
	}
	public void addElment(Object obj) {
		link.addFirst(obj);

	}
	public Object get(){
		return link.removeFirst();
	}
	public boolean IsEmpty(){
		return link.isEmpty();
	}

}
