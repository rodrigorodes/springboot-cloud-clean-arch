package br.com.rodslab.core.usecase.impl;

import javax.inject.Named;

import br.com.rodslab.core.dataprovider.BookClient;
import br.com.rodslab.core.dataprovider.RatingRepository;
import br.com.rodslab.core.entity.Rating;
import br.com.rodslab.core.usecase.CreateRatingUseCase;
import br.com.rodslab.core.usecase.command.CreateRatingCommand;
import br.com.rodslab.core.usecase.exception.BusinessException;
import br.com.rodslab.core.usecase.mapper.CreateRatingMapper;
import br.com.rodslab.core.usecase.representation.CreateRatingRepresentation;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Named
public class CreateRatingUseCaseImpl implements CreateRatingUseCase {

	private BookClient bookClient;
	private RatingRepository ratingRepository;

	@Override
	public CreateRatingRepresentation execute(CreateRatingCommand createRatingCommand) {

		boolean isExistsBook = bookClient.isExistsBookById(createRatingCommand.getBookId());

		if (isExistsBook) {
			throw new BusinessException(" Book has not found ! ");
		}

		Rating rating = createRatingCommand.toModel();

		return CreateRatingMapper.map(ratingRepository.save(rating));
	}

}
