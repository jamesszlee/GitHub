package ch10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.PrintStream;

public class FileIO01_TWR {

	public static void main(String[] args) {
		String path = "D:\\_Java\\jdk1.8\\src.zip";
		String path2 = "D:\\_Java\\jdk1.8\\src2.zip";
		File file = new File(path);
		File file2 = new File(path2);
		try(
				FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream(file2);
			) {
				
			long s = System.currentTimeMillis();
			byte[] b = new byte[819200];
			int n;
			while ((n = fis.read(b)) != -1) {
				fos.write(b, 0, n);
			}
			// System.out.println(n);
			long e = System.currentTimeMillis();
			System.out.println("¶O®É:" + (e - s));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}