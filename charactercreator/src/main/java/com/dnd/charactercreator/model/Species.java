package com.dnd.charactercreator.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Species")
public class Species {

    @Id
    @Column(name = "SpeciesName")
    private String speciesName;

    private String CreatureType;
    private Integer Speed;
    private String SpeciesProficiencies;

    public Species() {}

    public String getSpeciesName() { return speciesName; }
    public void setSpeciesName(String speciesName) { this.speciesName = speciesName; }

    public String getCreatureType() { return CreatureType; }
    public void setCreatureType(String creatureType) { CreatureType = creatureType; }

    public Integer getSpeed() { return Speed; }
    public void setSpeed(Integer speed) { Speed = speed; }

    public String getSpeciesProficiencies() { return SpeciesProficiencies; }
    public void setSpeciesProficiencies(String proficiency) { SpeciesProficiencies = proficiency; }

    @Override
    public String toString() {
        return speciesName;
    }
}
