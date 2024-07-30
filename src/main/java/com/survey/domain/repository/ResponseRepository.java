package com.survey.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.survey.persistence.entities.Response;

public interface ResponseRepository extends CrudRepository<Response,Long> {

}
