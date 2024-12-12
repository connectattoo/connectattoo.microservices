package com.grpc.client.client_grpc;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientGrpcApplication {
	public static void main(String[] args) {
		SpringApplication.run(ClientGrpcApplication.class, args);
	}
}
