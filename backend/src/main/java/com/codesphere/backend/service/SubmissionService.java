package com.codesphere.backend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Class to implement the processing logic for submission API calls
 */
@Component
public class SubmissionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SubmissionService.class);

    public String submitCode() {
        return "Code Submitted!";
    }
}
