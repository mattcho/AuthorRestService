package dongukc;

import org.springframework.beans.factory.annotation.Autowired;

public class AuthorServiceImpl implements AuthorServiceCustom {
	
	@Autowired
	private AuthorService authorService;

	@Override
	public Author findByName(String name) {
		
		System.out.println(name);
		
		for (Author a: this.authorService.findAll()) {
			
			System.out.println(a.getName());
			System.out.println(a.getName().equals(name));
			
			if (a.getName().equals(name)) {
				
				return a;
			}
		}
		
		return null;
	}
}
