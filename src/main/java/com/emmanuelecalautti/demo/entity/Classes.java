package com.emmanuelecalautti.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
public class Classes {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String title, description;
}
