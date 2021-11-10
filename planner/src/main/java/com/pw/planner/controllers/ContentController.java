package com.pw.planner.controllers;

import java.util.List;

import com.pw.planner.models.Content;
import com.pw.planner.services.ContentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/content")
public class ContentController {
    @Autowired
    private ContentService contentService;

    @GetMapping
    public ResponseEntity<List<Content>> findAll() {
        var result = contentService.findAll();
        return ResponseEntity.ok(result);
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<Content> save(@RequestBody Content content) {
        var result = contentService.save(content);
        return ResponseEntity.ok(result);
    }
}
