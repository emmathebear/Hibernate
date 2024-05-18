package com.emmanuelecalautti.demo.repository;

import com.emmanuelecalautti.demo.entity.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassesRepository extends JpaRepository<Classes,Long> {
}
