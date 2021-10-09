package interview;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

//import java.io.File;

public class ClassB extends ClassA {
	int length=20;
	public ClassB(){
		//this();
		//System.out.println(super.length);
		//System.out.println(super.length);
		System.out.println("This is subclass constructor");
	}
	public void getMethod(){
		//Properties prop =new Properties();
		//prop.load(new FileInputStream(new File("./src/test/resources/config.properties")));
		//File file =new File("");
		//new FileUtils
		
		System.out.println("this is child get method");
	}
public void newMethod(){
		
		System.out.println("this is child get method");
	}
public void printMethod(){
	System.out.println("This is a child print method");
}
	public static void main(String[] args) {
		ClassA a=new ClassB();
		a.getMethod();
		((ClassB) a).printMethod();
		/*System.out.println(a.length);
		a.getMethod();*/
	}
}
