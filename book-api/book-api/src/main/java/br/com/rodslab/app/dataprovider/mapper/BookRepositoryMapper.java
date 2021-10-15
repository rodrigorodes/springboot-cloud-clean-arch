package br.com.rodslab.app.dataprovider.mapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.rodslab.app.dataprovider.entity.BookEntity;
import br.com.rodslab.core.entity.Book;
import br.com.rodslab.core.entity.Page;
import lombok.experimental.UtilityClass;

@UtilityClass
public class BookRepositoryMapper {
	
    public BookEntity toDatabaseEntity(final Book book) {
        return BookEntity.builder()
                .author(book.getAuthor())
                .title(book.getTitle())
                .build();
    }
    
    public Book toModel(final BookEntity bookEntity) {
        return Book.builder()
        		.id(bookEntity.getId())
                .author(bookEntity.getAuthor())
                .title(bookEntity.getTitle())
                .build();
    }
    
    public Optional<Book> toModelOptinal(final Optional<BookEntity> bookEntityOptional) {
    	
    	if(bookEntityOptional.isEmpty()) {
    		return Optional.empty();
    	}
    	
    	BookEntity bookEntity = bookEntityOptional.get();
    	
        return Optional.ofNullable(Book.builder()
        		.id(bookEntity.getId())
                .author(bookEntity.getAuthor())
                .title(bookEntity.getTitle())
                .build());
    }
    
    public Page<Book> toPageModel(org.springframework.data.domain.Page<BookEntity> pageBook) {
    	
    	List<Book> books = pageBook
    			.getContent()
    			.stream()
    			.map(page -> toModel(page))
    			.collect(Collectors.toList());
    	
    	return new Page<Book>(books,pageBook.getNumber(), pageBook.getSize(), pageBook.getTotalPages());
    }

}
