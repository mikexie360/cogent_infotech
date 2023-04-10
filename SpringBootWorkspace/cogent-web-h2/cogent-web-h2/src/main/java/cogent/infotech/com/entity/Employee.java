package cogent.infotech.com.entity;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.data.annotation.Id;
import jakarta.persistence.*;
//import javax.persistence.Id;

import jakarta.annotation.Generated;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@DynamicUpdate
@Getter
@Setter
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	private String employeeName;
	private String employeeAddress;
	private String employeePhone;
	
	
	
	public Employee() {
		super();
	}



	public Employee(Long employeeId, String employeeName, String employeeAddress, String employeePhone) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}



	public Long getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public String getEmployeeAddress() {
		return employeeAddress;
	}



	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}



	public String getEmployeePhone() {
		return employeePhone;
	}



	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}
	
	
	
	
}
