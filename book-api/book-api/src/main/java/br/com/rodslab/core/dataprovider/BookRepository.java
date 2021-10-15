package br.com.rodslab.core.dataprovider;

import java.util.Optional;

import br.com.rodslab.core.entity.Book;
import br.com.rodslab.core.entity.Page;
import br.com.rodslab.core.usecase.command.PageCommand;

public interface BookRepository {

	Book save(Book book);

	Page<Book> findAll(PageCommand pageCommand);

	Optional<Book> findBookById(Long bookId);

}
