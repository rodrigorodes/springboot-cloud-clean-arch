package br.com.rodslab.core.usecase;

import java.util.Optional;

import br.com.rodslab.core.usecase.command.FindBookByIdCommand;
import br.com.rodslab.core.usecase.representation.FindBookByIdRepresentation;

public interface FindBookByIdUseCase {
	
	Optional<FindBookByIdRepresentation> execute(FindBookByIdCommand findBookByIdCommand);
 
}
