package ch10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.imageio.stream.FileCacheImageOutputStream;

import org.omg.CORBA.portable.OutputStream;

public class FileIO06 {

	public static void main(String[] args) {
		String path = "D:\\DataCNS11643.txt";
		String path2 = "D:\\DataBIG5001.txt";
		File file2 = new File(path2);
		try {
			url url = new URL(surl);
			int n = 0;
			String line;
			int count = 0;
			//FileReader fr = new FileReader(file);
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis, "CNS11643");
			BufferedReader br = new BufferedReader(isr);
			
			//FileWriter fw = new FileWriter(file2);
			FileOutputStream fos = new FileOutputStream(file2);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "BIG5");
			PrintWriter pw = new PrintWriter(osw);
			while ((line = br.readLine()) != null) {
				System.out.println(line + ", Len=" + line.length());
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
