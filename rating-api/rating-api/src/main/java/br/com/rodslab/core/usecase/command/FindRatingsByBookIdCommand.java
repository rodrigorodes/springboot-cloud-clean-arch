package br.com.rodslab.core.usecase.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FindRatingsByBookIdCommand {

	private Long bookId;

}
