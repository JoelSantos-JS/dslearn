package com.devsuperior.dslearnbds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslearnbds.dto.NotificationDTO;
import com.devsuperior.dslearnbds.model.Notification;
import com.devsuperior.dslearnbds.model.User;
import com.devsuperior.dslearnbds.repository.NotificationRepostory;

@Service
public class NotifiicationService {

    @Autowired
    private NotificationRepostory notificationRepostory;

    @Autowired
    private AuthService authService;

    @Transactional(readOnly = true)
    public Page<NotificationDTO> notificationsForCurrentUser(Pageable page) {
        User user = authService.authenticated();

        Page<Notification> noPage = notificationRepostory.findByUser(user, page);

        return noPage.map(e -> new NotificationDTO(e));

    }
}
