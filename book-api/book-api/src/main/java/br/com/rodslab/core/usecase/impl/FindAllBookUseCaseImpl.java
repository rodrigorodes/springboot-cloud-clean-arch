package br.com.rodslab.core.usecase.impl;

import javax.inject.Named;

import br.com.rodslab.core.dataprovider.BookRepository;
import br.com.rodslab.core.usecase.FindAllBookUseCase;
import br.com.rodslab.core.usecase.command.PageCommand;
import br.com.rodslab.core.usecase.mapper.FindAllBookMapper;
import br.com.rodslab.core.usecase.representation.FindAllBookRepresentation;
import br.com.rodslab.core.usecase.representation.PageRepresentation;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Named
class FindAllBookUseCaseImpl implements FindAllBookUseCase {

	private BookRepository bookRepository;

	@Override
	public PageRepresentation<FindAllBookRepresentation> execute(PageCommand pageCommand) {
		return  FindAllBookMapper.map(bookRepository.findAll(pageCommand));
	}

}
