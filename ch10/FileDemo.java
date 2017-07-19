package ch10;

import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;

public class FileDemo {

	public static void main(String[] args) {
		File f1 = new File("C:\\java006\\images");
		if (f1.exists()) {
			if (f1.isDirectory()) {
				System.out.println("f1是資料夾");
			} else {
				System.out.println("f1是檔案");
			}
		} else {
			System.out.println("f1不存在");
			//f1.mkdirs();
			//f1.createNewFile();
		}
		File f2 = new File("D:\\_java\\eclipse\\");
		File f3 = new File(f2, "eclipse.exe");
		System.out.println("f3.isFile()=>" + f3.isFile());
		System.out.println("f3.isFile()=>" + f3.length());
		System.out.println("f3.isFile()=>" + f3.getAbsolutePath());
		long lm = f3.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		String s = sdf.format(new Date(lm));
		System.out.println(s);
		
	}

}
