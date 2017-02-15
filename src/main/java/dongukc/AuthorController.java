package dongukc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import dongukc.Author;
import dongukc.AuthorService;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;
    
    @Autowired
    private AuthorServiceCustom authorServiceCustom;
    
    
    
    @RequestMapping("/api/author")
    public Iterable<Author> getAuthors() {
    
    	Iterable<Author> authors = this.authorService.findAll();
    	
    	return authors;
    }
    
    @RequestMapping("/api/author/{id}")
	public Author getAuthor(@PathVariable("id") long id) {
		Author author = this.authorService.findOne(id);
		return author;
	}
    
    @RequestMapping("/api/author/name")
    public Author getAuthorByName(@RequestParam("name") String name) {
    	Author author = this.authorServiceCustom.findByName(name);
		return author;
    }
    
    @RequestMapping(value = "/api/author", method = RequestMethod.POST)
    public void saveAuthor(@RequestBody Author author) {
    	
        System.out.println(author);
        
        authorService.save(author);
        
        System.out.println("Author saved");
    }
}