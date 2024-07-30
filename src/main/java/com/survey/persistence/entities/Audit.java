package com.survey.persistence.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Embeddable
public class Audit {

   
    @JoinColumn(name = "create_at")
    private LocalDateTime createAt;

    @JoinColumn(name = "update_at")
    private LocalDateTime upDateAt;

    

    @PrePersist
    public void prePersist() {
        // Se ejecuta antes de que la entidad sea persistida en la base de datos
        createAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        // Se ejecuta antes de que la entidad sea actualizada en la base de datos
        upDateAt = LocalDateTime.now();
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpDateAt() {
        return upDateAt;
    }

    public void setUpDateAt(LocalDateTime upDateAt) {
        this.upDateAt = upDateAt;
    }

    
}
