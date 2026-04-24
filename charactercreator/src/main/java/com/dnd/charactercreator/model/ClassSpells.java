package com.dnd.charactercreator.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ClassSpells")
public class ClassSpells {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String className;

    @Column(nullable = false)
    private String spellName;

    public ClassSpells() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }
}
