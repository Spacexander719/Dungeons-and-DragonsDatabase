package com.dnd.charactercreator.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Spells")
public class Spell {

    @Id
    @Column(name = "SpellName")
    private String spellName;

    private Integer spellLevel;
    private String CastingTime;
    private String School;
    private String Duration;

    @Column(name = "SpellRange")
    private String spellRange;

    private String Components;

    private Boolean IsRitual;

    public Spell() {}

    public String getSpellName() { return spellName; }
    public void setSpellName(String spellName) { this.spellName = spellName; }

    public Integer getSpellLevel() { return spellLevel; }
    public void setSpellLevel(Integer spellLevel) { spellLevel = spellLevel; }

    public String getCastingTime() { return CastingTime; }
    public void setCastingTime(String castingTime) { CastingTime = castingTime; }

    public String getSchool() { return School; }
    public void setSchool(String school) { School = school; }

    public String getDuration() { return Duration; }
    public void setDuration(String duration) { Duration = duration; }

    public String getSpellRange() { return spellRange; }
    public void setSpellRange(String spellRange) { this.spellRange = spellRange; }

    public String getComponents() { return Components; }
    public void setComponents(String components) { Components = components; }

    public Boolean getIsRitual() { return IsRitual; }
    public void setIsRitual(Boolean isRitual) { IsRitual = isRitual; }

    @Override
    public String toString() {
        return spellName;
    }
}
