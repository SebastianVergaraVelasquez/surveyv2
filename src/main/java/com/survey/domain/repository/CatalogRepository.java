package com.survey.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.survey.persistence.entities.Catalog;

public interface CatalogRepository extends CrudRepository<Catalog,Long> {

}
