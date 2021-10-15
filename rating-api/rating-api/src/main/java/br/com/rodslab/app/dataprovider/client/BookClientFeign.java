package br.com.rodslab.app.dataprovider.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rodslab.app.dataprovider.client.dto.BookDTO;

@FeignClient("books")
public interface BookClientFeign {

	@RequestMapping("/{bookId}")
	BookDTO findRatingsByBookId(@PathVariable Long bookId);
}
