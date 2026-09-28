package com.ethan.ctf_platform;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Competition {


    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;


    protected Competition() {

    }
    public Competition(
    String name,
    String description,
    LocalDateTime startTime,
    LocalDateTime endTime
    ){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        if(description == null || description.isBlank()){
            throw new IllegalArgumentException("Description cannot be null or blank");
        }
        if(startTime == null){
            throw new IllegalArgumentException("Start time cannot be null");
        }
        if(endTime == null){
            throw new IllegalArgumentException("End time cannot be null");
        }
        if(!endTime.isAfter(startTime)){
            throw new IllegalArgumentException("End time must be after start time");
        }
        this.name = name;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getId(){
        return this.id;
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
    public LocalDateTime getEndTime(){
        return this.endTime;
    }
}
