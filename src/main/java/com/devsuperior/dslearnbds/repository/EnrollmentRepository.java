package com.devsuperior.dslearnbds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.model.Enrollment;
import com.devsuperior.dslearnbds.model.pk.EnrolmentPk;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrolmentPk> {

}
