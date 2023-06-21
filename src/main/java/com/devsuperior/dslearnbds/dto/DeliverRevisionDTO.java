package com.devsuperior.dslearnbds.dto;

import java.util.Objects;

import com.devsuperior.dslearnbds.model.enums.DeliverStatus;

public class DeliverRevisionDTO {

    private DeliverStatus status;
    private String feedBack;
    private Integer correctCount;

    public DeliverRevisionDTO() {
    }

    public DeliverRevisionDTO(DeliverStatus status, String feedBack, Integer correctCount) {
        this.status = status;
        this.feedBack = feedBack;
        this.feedBack = feedBack;
        this.correctCount = correctCount;

    }

    public DeliverStatus getStatus() {
        return this.status;
    }

    public void setStatus(DeliverStatus status) {
        this.status = status;
    }

    public String getFeedBack() {
        return this.feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }

    public Integer getCorrectCount() {
        return this.correctCount;
    }

    public void setCorrectCount(Integer correctCount) {
        this.correctCount = correctCount;
    }

    public DeliverRevisionDTO status(DeliverStatus status) {
        setStatus(status);
        return this;
    }

    public DeliverRevisionDTO feedBack(String feedBack) {
        setFeedBack(feedBack);
        return this;
    }

    public DeliverRevisionDTO correctCount(Integer correctCount) {
        setCorrectCount(correctCount);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DeliverRevisionDTO)) {
            return false;
        }
        DeliverRevisionDTO deliverRevisionDTO = (DeliverRevisionDTO) o;
        return Objects.equals(status, deliverRevisionDTO.status)
                && Objects.equals(feedBack, deliverRevisionDTO.feedBack)
                && Objects.equals(correctCount, deliverRevisionDTO.correctCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, feedBack, correctCount);
    }

    @Override
    public String toString() {
        return "{" +
                " status='" + getStatus() + "'" +
                ", feedBack='" + getFeedBack() + "'" +
                ", correctCount='" + getCorrectCount() + "'" +
                "}";
    }

}
