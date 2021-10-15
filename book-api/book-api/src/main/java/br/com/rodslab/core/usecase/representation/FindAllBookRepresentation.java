package br.com.rodslab.core.usecase.representation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FindAllBookRepresentation {

	private Long id;
	private String title;
	private String author;
}
