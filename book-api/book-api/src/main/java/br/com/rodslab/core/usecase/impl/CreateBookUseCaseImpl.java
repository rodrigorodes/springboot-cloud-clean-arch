package br.com.rodslab.core.usecase.impl;

import javax.inject.Named;

import br.com.rodslab.core.dataprovider.BookRepository;
import br.com.rodslab.core.entity.Book;
import br.com.rodslab.core.usecase.CreateBookUseCase;
import br.com.rodslab.core.usecase.command.CreateBookCommand;
import br.com.rodslab.core.usecase.mapper.CreateBookMapper;
import br.com.rodslab.core.usecase.representation.CreateBookRepresentation;

@Named
class CreateBookUseCaseImpl implements CreateBookUseCase {
	
	private BookRepository bookRepository;
	
	public CreateBookUseCaseImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@Override
	public CreateBookRepresentation execute(CreateBookCommand createBookCommand) {
		Book book = createBookCommand.toModel();
		
		return CreateBookMapper.map(bookRepository.save(book));
	}

}
