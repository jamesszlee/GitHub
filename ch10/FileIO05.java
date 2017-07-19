package ch10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIO05 {

	public static void main(String[] args) {
		String path = "D:\\DataBIG58.txt";
		String path2 = "D:\\DataBIG58_OUT.txt";
		File file = new File(path);
		File file2 = new File(path2);
		try (
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter(file2);
				PrintWriter pw = new PrintWriter(fw);
			){
			int n = 0;
			String line;
			int count = 0;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line + ",,,,,, Len=" + line.length());
				pw.println(line + ",,,,,, Len=" + line.length()); // 印至檔案
				count++;
			}
			pw.close();
			System.out.println("讀取次數: " + count);

		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
