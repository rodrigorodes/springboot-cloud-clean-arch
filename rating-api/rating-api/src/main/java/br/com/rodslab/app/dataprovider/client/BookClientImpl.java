package br.com.rodslab.app.dataprovider.client;

import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.rodslab.app.dataprovider.client.dto.BookDTO;
import br.com.rodslab.core.dataprovider.BookClient;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class BookClientImpl implements BookClient {
	
	private BookClientFeign bookClientFeign;

	@Override
	public boolean isExistsBookById(Long bookId) {
		Optional<BookDTO> bookEntityOptional = Optional.ofNullable(bookClientFeign.findRatingsByBookId(bookId));
		return bookEntityOptional.isPresent();
	}

}
