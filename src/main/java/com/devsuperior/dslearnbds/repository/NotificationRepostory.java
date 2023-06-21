package com.devsuperior.dslearnbds.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.model.Notification;
import com.devsuperior.dslearnbds.model.User;

@Repository
public interface NotificationRepostory extends JpaRepository<Notification, Long> {

    Page<Notification> findByUser(User user, Pageable pageable);

}
