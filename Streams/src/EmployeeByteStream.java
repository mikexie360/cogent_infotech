import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class EmployeeByteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c://streams//employee.txt");
			int i = 0;
			while((i= fis.read())!= -1) {
				System.out.print((char)i);
			}
		fis.close();
		}catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
