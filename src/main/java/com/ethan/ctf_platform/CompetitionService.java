package com.ethan.ctf_platform;


import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class CompetitionService {
    private final CompetitionRepository competitionRepository;

    public CompetitionService(CompetitionRepository competitionRepository) {
        this.competitionRepository = competitionRepository;
    }

    public Competition createCompetition( String name, String description, LocalDateTime startTime, LocalDateTime endTime) {
        Competition newCompetition = new Competition(name, description, startTime, endTime);
        LocalDateTime now = LocalDateTime.now();
        if(!endTime.isAfter(now)){
            throw new IllegalArgumentException("End time must be after the current time");
        }
        return competitionRepository.save(newCompetition);
    }
}
