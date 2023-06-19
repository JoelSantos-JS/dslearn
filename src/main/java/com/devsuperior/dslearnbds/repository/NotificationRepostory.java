package com.devsuperior.dslearnbds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.model.Notification;

@Repository
public interface NotificationRepostory extends JpaRepository<Notification, Long> {

}
