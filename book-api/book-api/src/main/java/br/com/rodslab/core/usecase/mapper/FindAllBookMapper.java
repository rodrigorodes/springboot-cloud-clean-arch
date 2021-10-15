package br.com.rodslab.core.usecase.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.rodslab.core.entity.Book;
import br.com.rodslab.core.entity.Page;
import br.com.rodslab.core.usecase.representation.FindAllBookRepresentation;
import br.com.rodslab.core.usecase.representation.PageRepresentation;
import lombok.experimental.UtilityClass;

@UtilityClass
public class FindAllBookMapper {
	
	public PageRepresentation<FindAllBookRepresentation> map(Page<Book> pageBookEntity) {
    	List<FindAllBookRepresentation> findAllBooksRepresentation = new ArrayList<FindAllBookRepresentation>();
    	
    	pageBookEntity.getContent().forEach(page -> 
    	findAllBooksRepresentation.add(new FindAllBookRepresentation(page.getId(), page.getTitle(), page.getAuthor())) );
    	
    	return new PageRepresentation<FindAllBookRepresentation>(
    			findAllBooksRepresentation, 
    			pageBookEntity.getPageNumber(), 
    			pageBookEntity.getPageSize(),
    			pageBookEntity.getTotal());
	}
	
}
