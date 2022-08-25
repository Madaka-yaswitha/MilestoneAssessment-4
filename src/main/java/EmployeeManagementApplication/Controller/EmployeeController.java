package EmployeeManagementApplication.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import EmployeeManagementApplication.Model.Employee;

@RestController
public class EmployeeController {
	ArrayList<Employee> list=new ArrayList<Employee>();
	public EmployeeController() {
		
		list.add(new Employee(101,"Arun",20000));
		list.add(new Employee(102,"Bharathi",10000));
		list.add(new Employee(103,"Bhanu",25000));
		list.add(new Employee(104,"Sony",30000));
		list.add(new Employee(105,"Nani",40000));
		list.add(new Employee(106,"Nihu",35000));
		list.add(new Employee(107,"Mouni",23000));
		list.add(new Employee(108,"Jithu",60000));
		list.add(new Employee(109,"Jeevan",55000));
		list.add(new Employee(110,"Kiran",22000));
		
		for(Employee s:list)
			System.out.println(s.toString());
	}
	
	@RequestMapping("/")
	public String welcome() {
		return "Employee community";
	

	}
	@RequestMapping("/all")
	public List<Employee> getEmployee() {
		return list;
		
	}
	
	

}
