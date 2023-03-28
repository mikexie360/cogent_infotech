import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File("c://streams//abc.txt"));
			System.out.println("File is opened");
			
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			
		}catch(FileNotFoundException f) {
			System.out.println(f);
		} catch (IOException f) {
			System.out.println(f);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		
	
	}

}
