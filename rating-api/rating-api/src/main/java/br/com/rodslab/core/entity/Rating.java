package br.com.rodslab.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class Rating {

	private Long bookId;
	private int stars;
}
