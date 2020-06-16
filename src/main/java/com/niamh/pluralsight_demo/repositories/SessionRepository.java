package com.niamh.pluralsight_demo.repositories;

import com.niamh.pluralsight_demo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
