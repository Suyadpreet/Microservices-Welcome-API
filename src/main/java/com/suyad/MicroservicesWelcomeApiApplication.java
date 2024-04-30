package com.suyad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicesWelcomeApiApplication
{
	public static void main(String[] args) 
	{
		SpringApplication.run(MicroservicesWelcomeApiApplication.class, args);
		System.out.println("Welcome Api has been Started Successfully.......");
	}

}
