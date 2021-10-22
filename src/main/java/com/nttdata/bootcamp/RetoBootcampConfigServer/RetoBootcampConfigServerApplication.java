package com.nttdata.bootcamp.RetoBootcampConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class RetoBootcampConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetoBootcampConfigServerApplication.class, args);
	}

}
