package com.hms;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

//@SpringBootApplication
//public class HmsApplication {

	//public static void main(String[] args) {SpringApplication.run(ApplicationArguments.class);
	//}

//}


@SpringBootApplication
public class HmsApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(HmsApplication.class)
				.web(WebApplicationType.NONE) // .REACTIVE, .SERVLET
				.run(args);
	}
}
