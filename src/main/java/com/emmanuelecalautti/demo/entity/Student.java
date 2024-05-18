package com.emmanuelecalautti.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table
@Data
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String lastName, firstName;
    @Column(nullable = false, unique = true)
    private String email;
}
