package com.devsuperior.dslearnbds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.model.Lesson;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {

}
