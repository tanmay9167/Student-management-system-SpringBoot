package dura.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDockerIntegrationDemoApplication {
	
	@GetMapping(path="/dura")
	public String message() {return "Welcome to Duratech Solutions";} 

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDockerIntegrationDemoApplication.class, args);
	}

}
