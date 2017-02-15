package dongukc;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import dongukc.Author;

@Service
public interface AuthorService extends CrudRepository<Author, Long> {

}