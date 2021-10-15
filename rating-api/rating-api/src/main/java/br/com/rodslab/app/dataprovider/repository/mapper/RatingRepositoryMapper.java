package br.com.rodslab.app.dataprovider.repository.mapper;

import br.com.rodslab.app.dataprovider.repository.entity.RatingEntity;
import br.com.rodslab.core.entity.Rating;
import lombok.experimental.UtilityClass;

@UtilityClass

public class RatingRepositoryMapper {

	public static RatingEntity toDataBaseEntity(Rating rating) {
		return RatingEntity
				.builder()
				.bookId(rating.getBookId())
				.stars(rating.getStars())
				.build();
	}
	
	public static Rating toModel(RatingEntity rating) {
		return Rating
				.builder()
				.bookId(rating.getBookId())
				.stars(rating.getStars())
				.build();
	}

}
