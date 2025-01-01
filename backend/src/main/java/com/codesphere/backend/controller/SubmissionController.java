package com.codesphere.backend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codesphere.backend.service.SubmissionService;

/**
 * Controller class for defining all submission related APIs
 */
@RestController
@RequestMapping("/api/submission")
public class SubmissionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SubmissionController.class);

    @Autowired
    private SubmissionService submissionService;

    @PostMapping("/submit")
    public String submitCode() {
        return submissionService.submitCode();
    }
}
