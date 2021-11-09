package com.pw.planner.services;

import java.util.List;

import com.pw.planner.models.Planner;
import com.pw.planner.repositories.PlannerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlannerService {
    @Autowired
    private PlannerRepository plannerRepository;

    public List<Planner> findAll() {
        return plannerRepository.findAll();
    }

    public Planner save(Planner planner) {
        return plannerRepository.save(planner);
    }
}
