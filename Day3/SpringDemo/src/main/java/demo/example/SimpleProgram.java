package demo.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SimpleProgram {
	
	@GetMapping(value="/simple")
	String Message() {
		return "12345678910 numbers";

	}

}
