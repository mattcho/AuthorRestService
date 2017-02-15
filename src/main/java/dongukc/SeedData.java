package dongukc;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dongukc.Author;
import dongukc.AuthorService;

@Configuration
public class SeedData {

    @Autowired
    private AuthorService authorService;

    @Bean
    public SeedData getBean() throws SQLException {
    	
        
        Author a1 = new Author("Douglas Adams");
        Author a2 = new Author("Gautama Buddha");
        Author a3 = new Author("Albert Einstein");
        
        authorService.save(a1);
        authorService.save(a2);
        authorService.save(a3);

        return new SeedData();
    }
}