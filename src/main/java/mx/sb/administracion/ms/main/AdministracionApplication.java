package mx.sb.administracion.ms.main;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@SpringBootApplication
@EnableEurekaClient
public class AdministracionApplication implements CommandLineRunner{
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(AdministracionApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		String password= "AAGE710726";
		//callMeliService();
		for(int i=0;i<4;i++) {
			String passwordBcypt = passwordEncoder.encode(password);
			System.out.println(passwordBcypt);
		}
		
	}

}
