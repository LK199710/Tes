/**
 * 
 */
package cn.edu.hunau.liuyi;

/**
 * @author likang 2019œ¬ŒÁ6:21:23
 */

abstract class Animal {
	private String name;
	private int age;
	public abstract void eat();
	public Animal(){
		
	}
	public Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
		
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name =name;
		
	}

}
class Dog extends Animal {

	public void eat() {
		System.out.println("π∑≥‘»‚");

	}

}
class Cat extends Animal {
	public void eat() {
		System.out.println("√®≥‘”„");
	}
}
class DuotaiDemoTest{
	public static void main (String []args){
		Animal a = new Dog();
		a.eat();
		
	}
	
	
}