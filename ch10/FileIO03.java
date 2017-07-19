package ch10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//import java.io.PrintStream;

public class FileIO03 {

	public static void main(String[] args) {
		try {
			String path = "ObjectOut.dat";
			File file = new File(path);
			// FileInputStream fis = new FileInputStream(file);
			// BufferedInputStream bis = new BufferedInputStream(fis, 819200);
			// //
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos, 819200);
			ObjectOutputStream oos = new ObjectOutputStream(bos);

			long s = System.currentTimeMillis();
			for (int n = 1 ; n <= 100 ; n++) {
				Integer i = new Integer(n);
				oos.writeObject(i);
			}
			long e = System.currentTimeMillis();
			oos.close();
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis, 819200);
			ObjectInputStream ois = new ObjectInputStream(bis);//
			long sum = 0;
			while (true) {
				try {
					Object o = ois.readObject();
					if (o instanceof Integer) {
						Integer i = (Integer) o;
						sum += i.intValue();
					}
				} catch (EOFException e1) {
					System.out.println("Åª¨ú§¹²¦");
					break;
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			System.out.println("sum=" + sum);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
