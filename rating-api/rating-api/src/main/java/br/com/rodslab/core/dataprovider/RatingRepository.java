package br.com.rodslab.core.dataprovider;

import java.util.List;

import br.com.rodslab.core.entity.Rating;
import br.com.rodslab.core.usecase.representation.RatingRepresentation;

public interface RatingRepository {

	List<RatingRepresentation> findRatingsByBookId(Long bookId);

	Rating save(Rating rating);

}
