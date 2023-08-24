package com.wcci.virtualPetAPI.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "\"shelter\"")
public class VirtualPetShelter {

    @Id
    @Column(name = "shelter_id")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "litterbox")
    private int litterbox;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Ocatpet_shelter_id", referencedColumnName = "shelter_id")
    private List<OrganicCat> Ocat;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Odogpet_shelter_id", referencedColumnName = "shelter_id")
    private List<OrganicDog> Odog;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Rdogpet_shelter_id", referencedColumnName = "shelter_id")
    private List<RoboDog> Rdog;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Rcatpet_shelter_id", referencedColumnName = "shelter_id")
    private List<RoboCat> Rcat;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "shelter_volunteer", joinColumns = @JoinColumn(name = "volunteershelter_id"), inverseJoinColumns = @JoinColumn(name = "volunteer_id"))
    private List<Volunteer> volunteers;

    public VirtualPetShelter(String name, String description) {
        this.name = name;
        this.Ocat = new ArrayList<OrganicCat>();
        this.Odog = new ArrayList<OrganicDog>();
        this.Rcat = new ArrayList<RoboCat>();
        this.Rdog = new ArrayList<RoboDog>();
        this.volunteers = new ArrayList<Volunteer>();
        this.description = description;
    }

    public VirtualPetShelter() {
    }

    public VirtualPetShelter(String name, String description, int litterbox, List<OrganicCat> Ocat,
            List<OrganicDog> Odog, List<RoboDog> Rdog, List<RoboCat> Rcat, List<Volunteer> volunteers) {
        this.name = name;
        this.description = description;
        this.litterbox = litterbox;
        this.Ocat = Ocat;
        this.Odog = Odog;
        this.Rdog = Rdog;
        this.Rcat = Rcat;
        this.volunteers = volunteers;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLitterbox() {
        return this.litterbox;
    }

    public void setLitterbox(int litterbox) {
        this.litterbox = litterbox;
    }

    public List<OrganicCat> getOcat() {
        return this.Ocat;
    }

    public void setOcat(List<OrganicCat> Ocat) {
        this.Ocat = Ocat;
    }

    public List<OrganicDog> getOdog() {
        return this.Odog;
    }

    public void setOdog(List<OrganicDog> Odog) {
        this.Odog = Odog;
    }

    public List<RoboDog> getRdog() {
        return this.Rdog;
    }

    public void setRdog(List<RoboDog> Rdog) {
        this.Rdog = Rdog;
    }

    public List<RoboCat> getRcat() {
        return this.Rcat;
    }

    public void setRcat(List<RoboCat> Rcat) {
        this.Rcat = Rcat;
    }

    public List<Volunteer> getVolunteers() {
        List<Volunteer> output = new ArrayList<Volunteer>();
        for (Volunteer volunteer : this.volunteers) {
            Volunteer temporary = new Volunteer(volunteer.getName(),
                    volunteer.getDescription(), volunteer.getEmail());
            output.add(temporary);
        }
        return output;
    }

    public void addVolunteers(Volunteer newvolunteer) {
        this.volunteers.add(newvolunteer);
    }

    public void setVolunteers(List<Volunteer> volunteers) {
        this.volunteers = volunteers;
    }

}
