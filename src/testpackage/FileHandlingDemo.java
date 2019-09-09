package testpackage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
public class FileHandlingDemo {
	public static void main(String[] args) throws IOException  {
		
		
		File f = new File("./Files/file1.txt");
		
		//System.out.println(f.mkdirs());
		
		System.out.println(f.getAbsolutePath());
		
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		
		System.out.println(f.getName());
		
		File canonicalFile = f.getCanonicalFile();
		System.out.println(canonicalFile);
		
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getFreeSpace());
		System.out.println(f.getTotalSpace());
		System.out.println(f.getUsableSpace());
		
		String[] allFiles = f.list();
		
		for (String file : allFiles) {
			System.out.println(file);
		}
		
		File[] listFiles = f.listFiles();
		for (File file : listFiles) {
			System.out.println(file.getName());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		FileWriter fw = new FileWriter("./FileHandling/output.txt");
		
		fw.write("Hi this is file writer, using which u can directly write in file, dont");
		fw.flush();
		
		
		FileReader fr = new FileReader("./FileHandling/output.txt");
		int i = 0;
		while((i=fr.read())!=-1){
			System.out.print((char)i);
		}
		//Output : 
		//Hi this is file writer, using which u can directly write in file
		//I understood the above program and result also fine..
	
		
		while((fr.read())!=-1){
			System.err.print((char)fr.read());
		}
		//Output : 
		//iti sfl rtr sn hc  a ietywiei ie ot
		
		FileOutputStream fout = new FileOutputStream("./FileHandling/output.txt");
		
		//fout.write(97);
		
		//Write string in the file
		
		String s ="This is the source file..usoing buffer iutsteram";
		byte[] b = s.getBytes();
		fout.write(b);
		
		FileInputStream fis = new FileInputStream("./FileHandling/output.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		System.out.println(bis.read());
		int i = 0;
		while((i=bis.read())!=-1){
			System.out.print((char)i);
		}
		//use BufferedOutputStream
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s ="This is the source file..using bufferedOutputStream..";
		bout.write(s.getBytes());
		bout.flush();*/
		
		
		
	}

}
