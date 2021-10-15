package br.com.rodslab.core.usecase.mapper;

import br.com.rodslab.core.entity.Book;
import br.com.rodslab.core.usecase.representation.CreateBookRepresentation;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CreateBookMapper {

	public CreateBookRepresentation map(Book book) {
		return new CreateBookRepresentation(book.getId());
	}

}
