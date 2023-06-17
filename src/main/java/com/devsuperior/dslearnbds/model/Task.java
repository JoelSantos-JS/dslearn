package com.devsuperior.dslearnbds.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_task")
// @Data
public class Task extends Lesson {

    private String description;
    private Integer questionCount;
    private Integer approvalCount;
    private Double weight;
    private Instant duoDate;

    public Task() {

    }

    public Task(long id, String title, Integer position, Section section, String description, Integer questionCount,
            Integer approvalCount, Double weight, Instant duoDate) {
        super(id, title, position, section);
        this.description = description;
        this.questionCount = questionCount;
        this.approvalCount = approvalCount;
        this.weight = weight;
        this.duoDate = duoDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(Integer questionCount) {
        this.questionCount = questionCount;
    }

    public Integer getApprovalCount() {
        return approvalCount;
    }

    public void setApprovalCount(Integer approvalCount) {
        this.approvalCount = approvalCount;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Instant getDuoDate() {
        return duoDate;
    }

    public void setDuoDate(Instant duoDate) {
        this.duoDate = duoDate;
    }

}
