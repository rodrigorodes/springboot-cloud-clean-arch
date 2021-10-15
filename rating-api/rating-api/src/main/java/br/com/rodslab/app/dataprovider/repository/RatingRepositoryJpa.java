package br.com.rodslab.app.dataprovider.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.rodslab.app.dataprovider.repository.entity.RatingEntity;

public interface RatingRepositoryJpa extends CrudRepository<RatingEntity, Long> {

}
