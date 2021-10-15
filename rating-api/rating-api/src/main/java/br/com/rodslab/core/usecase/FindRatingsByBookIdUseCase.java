package br.com.rodslab.core.usecase;

import java.util.List;

import br.com.rodslab.core.usecase.command.FindRatingsByBookIdCommand;
import br.com.rodslab.core.usecase.representation.RatingRepresentation;

public interface FindRatingsByBookIdUseCase {

	List<RatingRepresentation> execute(FindRatingsByBookIdCommand findRatingsByBookIdCommand);

}
