package EmployeeManagementApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
		@GetMapping("/list")
		public String  ok() {
			return "Hello springboot welcome to docker";
		}

	}
	


