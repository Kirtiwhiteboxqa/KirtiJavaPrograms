package com.ExtraJavaPrograms;

/*Singleton class means you can create only one object for the given class. 
 * You can create a singleton class by making its constructor as private, so that you can restrict the creation of the object. 
 * Provide a static method to get instance of the object, wherein you can handle the object creation inside the class only. 
 * In this example we are creating object by using static block.
 * 
 */
public class SingletonClass {

	private static SingletonClass MyObj;

	static {
		MyObj = new SingletonClass();
	}

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {
		return MyObj;
	}
	public void testMe(){
		System.out.println("hey... its great!");
	}
	public static void main(String[] args) {
		SingletonClass obj= getInstance();
		obj.testMe();
	}
}
