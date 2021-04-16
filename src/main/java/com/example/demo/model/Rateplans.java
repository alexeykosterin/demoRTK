package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
public class Rateplans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    private String name;

    @Column(insertable = true, updatable = false)
    private LocalDateTime created;

    private LocalDateTime modified;

    private boolean deleted;

    public Rateplans(String name) {
        this.name = name;
    }

    public Rateplans() {

    }

    @PrePersist
    void onCreate() {
        this.setCreated(LocalDateTime.now());
        this.setModified(LocalDateTime.now());
    }

    private void setCreated(LocalDateTime now) {
    }

    private void setModified(LocalDateTime now) {
    }

    @PreUpdate
    void onUpdate() {
        this.setModified(LocalDateTime.now());
    }

    public Long getId() {
        return id;
    }

    public boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

}