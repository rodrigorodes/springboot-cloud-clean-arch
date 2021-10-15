package br.com.rodslab.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	private Long id;
	private String title;
	private String author;

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public static Book of(String title, String author) {
		return new Book(null, title, author);
	}
}
