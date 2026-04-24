package com.dnd.charactercreator.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Classes")
public class Classes {

    @Id
    @Column(name = "ClassName")
    private String className;

    private String HitDie;
    private String PrimaryStat1;
    private String PrimaryStat2;

    public Classes() {}

    @Override
    public String toString() {
        return this.className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classes classes = (Classes) o;
        return className != null && className.equals(classes.className);
    }

    @Override
    public int hashCode() {
        return className != null ? className.hashCode() : 0;
    }

    //Class Spells Relationship
    @ManyToMany
    @JoinTable(
            name = "ClassSpells",
            joinColumns = @JoinColumn(name = "ClassName"),
            inverseJoinColumns = @JoinColumn(name = "SpellName")
    )
    private List<Spell> spells = new ArrayList<>();


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getHitDie() {
        return HitDie;
    }

    public void setHitDie(String hitDie) {
        HitDie = hitDie;
    }

    public String getPrimaryStat1() {
        return PrimaryStat1;
    }

    public void setPrimaryStat1(String primaryStat1) {
        PrimaryStat1 = primaryStat1;
    }

    public String getPrimaryStat2() {
        return PrimaryStat2;
    }

    public void setPrimaryStat2(String primaryStat2) {
        PrimaryStat2 = primaryStat2;
    }

    //Spells get/set
    public List<Spell> getSpells() { return spells; }
    public void setSpells(List<Spell> spells) { this.spells = spells; }

}
