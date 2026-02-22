package com.learnSpringBoot.jobPortal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoryClass extends JpaRepository<entityClass,Integer> {
}
