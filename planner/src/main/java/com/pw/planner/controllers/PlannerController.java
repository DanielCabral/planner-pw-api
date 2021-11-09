package com.pw.planner.controllers;

import java.util.List;

import com.pw.planner.models.Planner;
import com.pw.planner.services.PlannerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/planner")
public class PlannerController {
    @Autowired
    private PlannerService plannerService;

    @GetMapping
    public ResponseEntity<List<Planner>> findAll() {
        var result = plannerService.findAll();
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<Planner> create(Planner planner) {
        planner.setId(0);
        var result = plannerService.save(planner);
        return ResponseEntity.ok(result);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<Planner> update(Planner planner) throws Exception {
        planner.setId(0);
        if (planner.getId() != 0) {
            var result = plannerService.save(planner);
            return ResponseEntity.ok(result);
        }
        throw new Exception("this does not exist");
    }
}
