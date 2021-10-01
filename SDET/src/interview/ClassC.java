package interview;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ClassC {
	public static void main(String[] args) {
		ClassA b=new ClassB();
		
		System.out.println(b.length);
		b.getMethod();
		
		try {
			RandomAccessFile raf=new RandomAccessFile("asd.txt", "txt");
			byte[] c=new byte[1000];
			raf.readFully(c, 0, 1000);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
