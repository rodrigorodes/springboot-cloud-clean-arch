package br.com.rodslab.core.usecase.impl;

import java.util.Optional;

import javax.inject.Named;

import br.com.rodslab.core.dataprovider.BookRepository;
import br.com.rodslab.core.usecase.FindBookByIdUseCase;
import br.com.rodslab.core.usecase.command.FindBookByIdCommand;
import br.com.rodslab.core.usecase.mapper.FindBookByIdMapper;
import br.com.rodslab.core.usecase.representation.FindBookByIdRepresentation;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Named
class FindBookByIdUseCaseImpl implements FindBookByIdUseCase {
	
	private BookRepository bookRepository;
	
	@Override
	public 	Optional<FindBookByIdRepresentation> execute(FindBookByIdCommand findBookByIdCommand) {
		return FindBookByIdMapper.map(bookRepository.findBookById(findBookByIdCommand.getBookId()));
	}

}
