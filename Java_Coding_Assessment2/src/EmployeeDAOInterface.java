import java.util.ArrayList;

public interface EmployeeDAOInterface {
	
	public void create(ArrayList<Employee> e);
	public void update(ArrayList<Employee> e);
	public void delete(ArrayList<Employee> e);
	public void readAll(ArrayList<Employee> e);
	public void searchEmployee(ArrayList<Employee> e);
	public void empSort(ArrayList<Employee> e);

}
