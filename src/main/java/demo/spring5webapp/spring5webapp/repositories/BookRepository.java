package demo.spring5webapp.spring5webapp.repositories;

import demo.spring5webapp.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
