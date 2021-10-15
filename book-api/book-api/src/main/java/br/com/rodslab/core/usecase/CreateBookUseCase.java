package br.com.rodslab.core.usecase;

import br.com.rodslab.core.usecase.command.CreateBookCommand;
import br.com.rodslab.core.usecase.representation.CreateBookRepresentation;

public interface CreateBookUseCase {

	CreateBookRepresentation execute(CreateBookCommand createBookCommand);

}
