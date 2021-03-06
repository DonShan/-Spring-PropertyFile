package Application;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.madushan.training.salesmanager.model.Employee;
import com.madushan.training.salesmanager.service.EmployeeService;
import com.madushan.traning.salesmanager.config.ApplicationConfiguration;


public class Application {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		
		System.out.println(employeeService.toString());
		//EmployeeService employeeService = new EmployeeServiceImpl();
		
		EmployeeService employeeService2 = applicationContext.getBean("employeeService", EmployeeService.class);
		
		System.out.println(employeeService2.toString());
		
		List<Employee> employees = employeeService.getAllEmployees();
		
		
		
		for (Employee employee : employees) {
			System.out.println(employee.getEmpoyeeName() + "a" + employee.getEmployeeLocation());
		}
		
		
		
	

	}

}
