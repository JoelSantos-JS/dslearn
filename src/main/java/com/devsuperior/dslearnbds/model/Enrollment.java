package com.devsuperior.dslearnbds.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.devsuperior.dslearnbds.model.pk.EnrolmentPk;

@Entity
@Table(name = "tb_enrollment")
// @Data
public class Enrollment {

    @EmbeddedId
    private EnrolmentPk id = new EnrolmentPk();

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant enroolMoment;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant refundMoment;
    private boolean available;
    private boolean onlyUpdate;

    public Enrollment() {

    }

    public Enrollment(User user, Offer offer, Instant enroolMoment, Instant refundMoment, boolean available) {
        this.id.setUser(user);
        this.id.setOffer(offer);
        this.enroolMoment = enroolMoment;
        this.refundMoment = refundMoment;
        this.available = available;

    }

    public User getUser() {
        return id.getUser();
    }

    public void setUser(User user) {
        id.setUser(user);
    }

    public Offer getOffer() {
        return id.getOffer();

    }

    public void setOffer(Offer offer) {
        id.setOffer(offer);

    }

    public EnrolmentPk getId() {
        return id;
    }

    public void setId(EnrolmentPk id) {
        this.id = id;
    }

    public Instant getEnroolMoment() {
        return enroolMoment;
    }

    public void setEnroolMoment(Instant enroolMoment) {
        this.enroolMoment = enroolMoment;
    }

    public Instant getRefundMoment() {
        return refundMoment;
    }

    public void setRefundMoment(Instant refundMoment) {
        this.refundMoment = refundMoment;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isOnlyUpdate() {
        return onlyUpdate;
    }

    public void setOnlyUpdate(boolean onlyUpdate) {
        this.onlyUpdate = onlyUpdate;
    }

}
