package br.com.rodslab.core.usecase;

import br.com.rodslab.core.usecase.command.PageCommand;
import br.com.rodslab.core.usecase.representation.FindAllBookRepresentation;
import br.com.rodslab.core.usecase.representation.PageRepresentation;

public interface FindAllBookUseCase {
	
	PageRepresentation<FindAllBookRepresentation> execute(PageCommand pageCommand);
 
}
