import java.util.List;
import java.util.ArrayList;

public interface BookManagement {
	
	public void create(List<Book> list);
	public void find(List<Book> list);
	public void update(List<Book> list);
	public void delete(List<Book> list);
	public void print(List<Book> list);
	
}
