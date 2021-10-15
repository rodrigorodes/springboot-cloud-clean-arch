package br.com.rodslab.app.dataprovider.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.rodslab.app.dataprovider.repository.mapper.RatingRepositoryMapper;
import br.com.rodslab.core.dataprovider.RatingRepository;
import br.com.rodslab.core.entity.Rating;
import br.com.rodslab.core.usecase.representation.RatingRepresentation;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Repository
public class RatingRepositoryImpl implements RatingRepository {
	
	private RatingRepositoryJpa ratingRepositoryJpa;

	@Override
	public List<RatingRepresentation> findRatingsByBookId(Long bookId) {
		return null;
	}

	@Override
	public Rating save(Rating rating) {
		return RatingRepositoryMapper.toModel(ratingRepositoryJpa.save(RatingRepositoryMapper.toDataBaseEntity(rating)));
	}

}
