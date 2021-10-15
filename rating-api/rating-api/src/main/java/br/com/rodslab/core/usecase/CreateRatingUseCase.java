package br.com.rodslab.core.usecase;

import br.com.rodslab.core.usecase.command.CreateRatingCommand;
import br.com.rodslab.core.usecase.representation.CreateRatingRepresentation;

public interface CreateRatingUseCase {
	
	CreateRatingRepresentation execute(CreateRatingCommand createRatingCommand);

}
