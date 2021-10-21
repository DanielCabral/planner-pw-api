package com.pw.planner.repositories;

import com.pw.planner.models.Planner;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlannerRepository extends JpaRepository<Planner, Long> {

}
