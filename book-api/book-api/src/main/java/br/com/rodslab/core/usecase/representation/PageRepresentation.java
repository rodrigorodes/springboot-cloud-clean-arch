package br.com.rodslab.core.usecase.representation;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PageRepresentation<T> {

	private List<T> content;
	private Integer page;
	private Integer size;
	private Integer totalPages;
}
