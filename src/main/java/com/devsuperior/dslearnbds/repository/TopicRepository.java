package com.devsuperior.dslearnbds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.model.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {

}
