package br.com.rodslab.app.dataprovider;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.rodslab.app.dataprovider.entity.BookEntity;

public interface BookRepositoryJpa extends PagingAndSortingRepository<BookEntity, Long> {

}
