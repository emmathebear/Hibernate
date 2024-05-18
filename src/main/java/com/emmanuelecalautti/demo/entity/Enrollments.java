package com.emmanuelecalautti.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
public class Enrollments {
    @Id
    @GeneratedValue
    private long id;

    @JoinColumn(nullable = false)
    @ManyToOne
    private Classes classes;

    @JoinColumn(nullable = false)
    @ManyToOne
    private Enrollments enrollments;

}
