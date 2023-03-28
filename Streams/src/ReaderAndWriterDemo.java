
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
import java.util.Scanner;

public class ReaderAndWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);
		String user="yes";
		if (new File(args[0]).isFile()) {
			System.out.println("File exists, would you like to Overwrite?(yes,no)");
			user = sc.next();
		}
		if(user.equals("yes")) {
			try {
				fr = new FileReader(args[0]);
				fw = new FileWriter(args[1]);
				
				int ch;
				while((ch = fr.read()) != -1) {
					fw.write(ch);
				}
				System.out.println("File read");
				fr.close();
				fw.close();
			} catch (FileNotFoundException  e) {
				System.out.println("File not found");
			} catch (IOException e) {
				System.out.println("IO Exception");
			}
		} else {
			System.out.println("File will not be overwritten");
		}
	}

}
