package pe.edu.vallegrande.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.edu.vallegrande.app.service.ConsultasService;

@SpringBootApplication
public class DemoJdbcApplication implements CommandLineRunner{
	
	@Autowired
	private ConsultasService consultasService;

	public static void main(String[] args) {
		SpringApplication.run(DemoJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Cuentas: " + consultasService.cantCuentas());
	}
}
