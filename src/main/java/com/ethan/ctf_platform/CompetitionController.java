package com.ethan.ctf_platform;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/competition")
public class CompetitionController {
    private final CompetitionService competitionService;

    public CompetitionController(CompetitionService competitionService) {
        this.competitionService = competitionService;
    }

    @GetMapping
    public List<Competition> getAllCompetitions() {
        return competitionService.getAllCompetitions();
    }
    @PostMapping
    public Competition createCompetition (@RequestBody CreateCompetitionRequest request){
        return competitionService.createCompetition(
            request.getName(),
            request.getDescription(),
            request.getStartTime(),
            request.getEndTime()
        );
    }

}
