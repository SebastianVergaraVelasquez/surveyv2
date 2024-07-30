package com.survey.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.survey.persistence.entities.ResponseOption;

public interface ResponseOptionRepository extends CrudRepository<ResponseOption,Long>{

}
