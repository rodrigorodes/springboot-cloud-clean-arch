package br.com.rodslab.core.usecase.command;

import br.com.rodslab.core.entity.Rating;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRatingCommand {

	private Long bookId;
	private int stars;

	public Rating toModel() {
		return new Rating(this.bookId, this.stars);
	}
}
