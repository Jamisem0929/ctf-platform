package com.ethan.ctf_platform;

import java.time.LocalDateTime;

public class CreateCompetitionRequest {
    private String name;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public CreateCompetitionRequest() {
    }

    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public LocalDateTime getStartTime(){
        return this.startTime;
    }
    public LocalDateTime getEndTime() {
        return this.endTime;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setStartTime(LocalDateTime startTime){
        this.startTime = startTime;
    }
    public void setEndTime(LocalDateTime endTime){
        this.endTime = endTime;
    }

}
