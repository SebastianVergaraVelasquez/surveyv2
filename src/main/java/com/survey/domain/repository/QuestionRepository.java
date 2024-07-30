package com.survey.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.survey.persistence.entities.Question;

public interface QuestionRepository extends CrudRepository<Question,Long> {

}
