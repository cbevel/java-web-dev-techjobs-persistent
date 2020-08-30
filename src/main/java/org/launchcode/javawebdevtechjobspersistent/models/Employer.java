package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min = 3, max = 50, message = "Please enter a location")
    private String location;

    public Employer() {
    }

    @OneToMany(mappedBy = "employer", cascade = CascadeType.ALL)
    private final List<Job> jobs = new ArrayList<>();


    //Getters and Setters

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}