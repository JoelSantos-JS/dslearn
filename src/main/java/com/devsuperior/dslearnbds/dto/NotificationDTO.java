package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.devsuperior.dslearnbds.model.Notification;

public class NotificationDTO implements Serializable {

    private long id;
    private String text;
    private boolean read;
    private Instant moment;
    private String route;
    private long userId;

    public NotificationDTO() {
    }

    public NotificationDTO(long id, String text, boolean read, Instant moment, String route, long userId) {
        this.id = id;
        this.text = text;
        this.read = read;
        this.moment = moment;
        this.route = route;
        this.userId = userId;
    }

    public NotificationDTO(Notification notification) {
        this.id = notification.getId();
        this.text = notification.getText();
        this.read = notification.isRead();
        this.moment = notification.getMoment();
        this.route = notification.getRoute();
        this.userId = notification.getUser().getId();
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isRead() {
        return this.read;
    }

    public boolean getRead() {
        return this.read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public Instant getMoment() {
        return this.moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public String getRoute() {
        return this.route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public NotificationDTO id(long id) {
        setId(id);
        return this;
    }

    public NotificationDTO text(String text) {
        setText(text);
        return this;
    }

    public NotificationDTO read(boolean read) {
        setRead(read);
        return this;
    }

    public NotificationDTO moment(Instant moment) {
        setMoment(moment);
        return this;
    }

    public NotificationDTO route(String route) {
        setRoute(route);
        return this;
    }

    public NotificationDTO userId(long userId) {
        setUserId(userId);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof NotificationDTO)) {
            return false;
        }
        NotificationDTO notificationDTO = (NotificationDTO) o;
        return id == notificationDTO.id && Objects.equals(text, notificationDTO.text) && read == notificationDTO.read
                && Objects.equals(moment, notificationDTO.moment) && Objects.equals(route, notificationDTO.route)
                && userId == notificationDTO.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, read, moment, route, userId);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", text='" + getText() + "'" +
                ", read='" + isRead() + "'" +
                ", moment='" + getMoment() + "'" +
                ", route='" + getRoute() + "'" +
                ", userId='" + getUserId() + "'" +
                "}";
    }

}
