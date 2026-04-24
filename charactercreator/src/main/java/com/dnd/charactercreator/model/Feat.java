package com.dnd.charactercreator.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Feats")
public class Feat {

    @Id
    @Column(name = "FeatName")
    private String featName;

    public Feat() {}

    public String getFeatName() { return featName; }
    public void setFeatName(String featName) { this.featName = featName; }

    @Override
    public String toString() {
        return featName;
    }
}
