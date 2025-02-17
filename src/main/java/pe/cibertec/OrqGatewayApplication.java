package pe.cibertec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrqGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrqGatewayApplication.class, args);
		System.out.println("orq-gateway iniciado correctamente");
	}

}
