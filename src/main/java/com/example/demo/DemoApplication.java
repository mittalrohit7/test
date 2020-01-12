package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/endpointtest")
	public String eldpointtest()
	{
		return "Welcome to endpointtest";
	}
	
	
	@GetMapping("/test")
	public String welcome()
	{
		return "Welcome to myDes";
	}
	
	public static void main(String[] args) {
		 if (System.getenv("WEB_TRUSTSTORE_PATH") != null && System.getenv("WEB_TRUSTSTORE_PASSWORD") != null) {
	            System.setProperty("javax.net.ssl.trustStore", System.getenv("WEB_TRUSTSTORE_PATH"));
	            System.setProperty("javax.net.ssl.trustStorePassword", System.getenv("WEB_TRUSTSTORE_PASSWORD"));
	        }
		SpringApplication.run(DemoApplication.class, args);
	}

}
