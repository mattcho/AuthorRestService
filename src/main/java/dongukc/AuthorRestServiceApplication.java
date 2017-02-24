package dongukc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AuthorRestServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(AuthorRestServiceApplication.class, args);
	}
}