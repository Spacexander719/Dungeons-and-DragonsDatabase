package com.dnd.charactercreator.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Backgrounds")
public class Background {

    @Id
    @Column(name = "BackgroundName")
    private String backgroundName;

    private String BackgroundProficiencies;
    private String Languages;

    public Background() {}

    public String getBackgroundName() { return backgroundName; }
    public void setBackgroundName(String backgroundName) { this.backgroundName = backgroundName; }

    public String getBackgroundProficiencies() { return BackgroundProficiencies; }
    public void setBackgroundProficiencies(String backgroundProficiencies) {
        BackgroundProficiencies = backgroundProficiencies;
    }

    public String getLanguages() { return Languages; }
    public void setLanguages(String languages) { Languages = languages; }

    @Override
    public String toString() {
        return backgroundName;
    }
}
