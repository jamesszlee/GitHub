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
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.stream.FileCacheImageOutputStream;

import org.omg.CORBA.portable.OutputStream;

public class FileIO07 {
	public static void main(String[] args) {
		String surl1 = "http://www.space-fox.com/wallpapers/celebs/penelope-cruz/penelope_cruz_";
		String surl3 = ".jpg";
		String path = "D:\\Test_Pictures\\";
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		for (int i =1; 1 <= 64; i++) {
			String surl = surl1 + i +surl3;
			int idx = surl1.lastIndexOf("/") + 1;
			String fileName = surl.substring(idx);
			File file2 = new File(path, fileName);
			
			try {
			URL url = new URL(surl);
			try (
				InputStream is = url.openStream();
				FileOutputStream fos = new FileOutputStream(file2);
			){
					
			byte[] b = new byte[819200];
			int n;
			while ((n = is.read(b)) != -1) {
				fos.write(b, 0, n);
						
		     }}
			catch (IOException e) {
			e.printStackTrace();
			}
			}  catch (MalformedURLException e) {
			e.printStackTrace();
		
		}
		}
			
	}
}