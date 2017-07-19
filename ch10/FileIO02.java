package ch10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.PrintStream;

public class FileIO02 {

	public static void main(String[] args) {
		try {
			String path = "D:\\_Java\\jdk1.8\\src.zip";
			String path2 = "D:\\_Java\\jdk1.8\\src2.zip";
			File file = new File(path);
			File file2 = new File(path2);
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis, 819200); //
			FileOutputStream fos = new FileOutputStream(file2);
			BufferedOutputStream bos = new BufferedOutputStream(fos, 819200); //
			long s = System.currentTimeMillis();
			byte[] b = new byte[819200];
			int n;
			while ((n = bis.read(b)) != -1) { //
				bos.write(b, 0, n); //
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