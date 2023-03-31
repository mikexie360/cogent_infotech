import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("c://streams//employee.txt");
			fos = new FileOutputStream("c://streams//newemployee.txt");
			
			int data;
			while((data = fis.read()) !=-1) {
				fos.write(data);
			}
			System.out.println("File copied");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception E) {
				
			}
		}
	}

}
