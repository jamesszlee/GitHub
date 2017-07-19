package ch10;

import java.io.FileReader;

public class FileIO04 {

	public static void main(String[] args) {
		try {
			String path = "D:\\DataBIG5.txt";
			File file = new File(path);
			int n = 0;
			int count = 0;
			FileInputStream fis = new FileInputStream(file);
			while ((n = fis.read()) != -1) {
				count++;
				System.out.println(n + "," + (char) n);
			}
			System.out.println("BIG5讀取次數: " + count);
			fis.close();
			count = 0;
			FileReader fr = new FileReader(file);
			while ((n = fr.read()) != -1) {
				count++;
				System.out.println(n + "," + (char) n);
			}
			System.out.println("讀取次數: " + count);
			fis.close();
			count = 0;

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
