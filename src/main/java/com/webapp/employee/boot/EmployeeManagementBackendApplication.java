package com.webapp.employee.boot;


import com.webapp.employee.boot.repository.EmployeeRepository;
import com.webapp.employee.boot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Bruce");
		employee.setLastName("Banner");
		employee.setEmailId("hulk@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Thor");
		employee1.setLastName("Odinson");
		employee1.setEmailId("hammer@gmail.com");
		employeeRepository.save(employee1);

		Employee employee2 = new Employee();
		employee2.setFirstName("Steven");
		employee2.setLastName("Strange");
		employee2.setEmailId("doctor@gmail.com");
		employeeRepository.save(employee2);

		Employee employee3 = new Employee();
		employee3.setFirstName("Thanos");
		employee3.setLastName("Inevitable");
		employee3.setEmailId("thanos@gmail.com");
		employeeRepository.save(employee3);
	}
}
