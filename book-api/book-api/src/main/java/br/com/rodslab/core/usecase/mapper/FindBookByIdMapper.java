package br.com.rodslab.core.usecase.mapper;

import java.util.Optional;

import br.com.rodslab.core.entity.Book;
import br.com.rodslab.core.usecase.representation.FindBookByIdRepresentation;
import lombok.experimental.UtilityClass;

@UtilityClass
public class FindBookByIdMapper {

	public 	Optional<FindBookByIdRepresentation> map(Optional<Book> bookOptional) {
		
		if(bookOptional.isEmpty()) {
			return Optional.empty();
		}
		
		Book book = bookOptional.get();
		
		return Optional.ofNullable(new FindBookByIdRepresentation(book.getId(), book.getTitle(), book.getAuthor()));
	}

}
