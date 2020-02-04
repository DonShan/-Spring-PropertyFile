package com.madushan.traning.salesmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.madushan.training.salesmanager.repository.EmployeeRepository;
import com.madushan.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.madushan.training.salesmanager.service.EmployeeService;
import com.madushan.training.salesmanager.service.EmployeeServiceImpl;


@Configuration
@ComponentScan("com.madushan")
@PropertySource("application.properties")
public class ApplicationConfiguration {
	
	@Bean(name = "employeeService")
	@Scope("prototype")
	public EmployeeService getEmloyeeService() {
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl(getEmployeeRepository());
		
		return employeeService;
	}
	
	@Bean
	Public Static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceHolderConfigurer() {
		return new propertySourcePlaceholderConfigurer();
	}
}
	
/*	
	@Bean(name = "employeeRepository")
	public EmployeeRepository getEmployeeRepository() {
		return new HibernateEmployeeRepositoryImpl();
	}

}

*/
