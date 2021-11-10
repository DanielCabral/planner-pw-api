package com.pw.planner.services;

import java.util.List;

import com.pw.planner.models.Content;
import com.pw.planner.repositories.ContentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentService {
    @Autowired
    private ContentRepository contentRepository;

    public List<Content> findAll() {
        return contentRepository.findAll();
    }

    public Content save(Content content) {
        return contentRepository.save(content);
    }
}
