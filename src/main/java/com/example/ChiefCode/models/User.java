package com.example.ChiefCode.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "chief")
public class User {
    @Id
    @UuidGenerator
    private String id;
    private String fullName;
    private String email;
}
