package com.githubexample.demoforgithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoforgithubApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Let's get started !!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoforgithubApplication.class, args);
	}

}


//echo "# githubActionsExample" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/SRIRAMGREEN/githubActionsExample.git
//git push -u origin main