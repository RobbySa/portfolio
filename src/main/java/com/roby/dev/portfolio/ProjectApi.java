package com.roby.dev.portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projects")
public class ProjectApi {
    @GetMapping("/{projectId}")
    public String getProject(String projectId)
    {
        return "Project found";
    }
}
