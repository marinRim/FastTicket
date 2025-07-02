package com.fastTicket;

import org.springframework.boot.SpringApplication;

public class TestFastTicketApplication {

	public static void main(String[] args) {
		SpringApplication.from(FastTicketApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
