package br.com.rodslab.core.usecase.impl;

import java.util.List;

import javax.inject.Named;

import br.com.rodslab.core.dataprovider.RatingRepository;
import br.com.rodslab.core.usecase.FindRatingsByBookIdUseCase;
import br.com.rodslab.core.usecase.command.FindRatingsByBookIdCommand;
import br.com.rodslab.core.usecase.representation.RatingRepresentation;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Named
class FindRatingsByBookIdUseCaseImpl implements FindRatingsByBookIdUseCase {

	private RatingRepository ratingRepository;

	@Override
	public List<RatingRepresentation> execute(FindRatingsByBookIdCommand findRatingsByBookIdCommand) {
		return this.ratingRepository.findRatingsByBookId(findRatingsByBookIdCommand.getBookId());
	}

}
