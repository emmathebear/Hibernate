package com.emmanuelecalautti.demo.repository;

import com.emmanuelecalautti.demo.entity.Enrollments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentsRepository extends JpaRepository<Enrollments, Long> {
}
