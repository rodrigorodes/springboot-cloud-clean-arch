package br.com.rodslab.core.usecase.command;

import br.com.rodslab.core.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateBookCommand {
	
	private String title;
	private String author;

	public Book toModel() {
		return Book.of(this.title, this.author);
	}

}
