package br.com.rodslab.app.dataprovider;

import java.util.Optional;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import br.com.rodslab.app.dataprovider.entity.BookEntity;
import br.com.rodslab.app.dataprovider.mapper.BookRepositoryMapper;
import br.com.rodslab.core.dataprovider.BookRepository;
import br.com.rodslab.core.entity.Book;
import br.com.rodslab.core.entity.Page;
import br.com.rodslab.core.usecase.command.PageCommand;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Repository
public class BookRepositoryImpl implements BookRepository {

	private BookRepositoryJpa bookRepositoryJpa;

	@Override
	public Book save(Book book) {
		BookEntity savebookEntity = bookRepositoryJpa.save(BookRepositoryMapper.toDatabaseEntity(book));
		return BookRepositoryMapper.toModel(savebookEntity);
	}

	@Override
	public Page<Book> findAll(PageCommand pageCommand) {
		
		return BookRepositoryMapper.toPageModel(
				bookRepositoryJpa.findAll(
						PageRequest.of(pageCommand.getPage(), pageCommand.getSize())));
	}

	@Override
	public Optional<Book> findBookById(Long bookId) {
		return BookRepositoryMapper.toModelOptinal(bookRepositoryJpa.findById(bookId));
	}

}
