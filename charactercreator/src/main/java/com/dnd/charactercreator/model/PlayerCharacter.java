package com.dnd.charactercreator.model;

import jakarta.persistence.*;
import com.dnd.charactercreator.model.Classes;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PlayerCharacter")
public class PlayerCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CharID;

    private String CharName;
    private Integer CharLevel;
    private Integer STR;
    private Integer CON;
    private Integer DEX;
    private Integer WIS;
    private Integer INTEL;
    private Integer CHA;
    private Integer MaxHP;

    //Character Class
    @ManyToOne
    @JoinColumn(name = "ClassName")
    private Classes characterClass;


    //Character Class relationship
    @ManyToMany
    @JoinTable(
            name = "CharacterClasses",
            joinColumns = @JoinColumn(name = "CharID"),
            inverseJoinColumns = @JoinColumn(name = "ClassName")
    )
    private List<Classes> classes = new ArrayList<>();

    //Species Relationship
    @ManyToOne
    @JoinColumn(name = "SpeciesName")
    private Species species;

    //Feats Relationship
    @ManyToMany
    @JoinTable(
            name = "CharacterFeats",
            joinColumns = @JoinColumn(name = "CharID"),
            inverseJoinColumns = @JoinColumn(name = "FeatName")
    )
    private List<Feat> feats = new ArrayList<>();

    //Background Relationship
    @ManyToOne
    @JoinColumn(name = "BackgroundName")
    private Background background;

    //Weapon Relationship
    @ManyToMany
    @JoinTable(
            name = "CharacterWeapons",
            joinColumns = @JoinColumn(name = "CharID"),
            inverseJoinColumns = @JoinColumn(name = "WeaponName")
    )
    private List<Weapon> weapons = new ArrayList<>();

    //Spell Relationship
    @ManyToMany
    @JoinTable(
            name = "CharacterSpellsPrepared",
            joinColumns = @JoinColumn(name = "CharID"),
            inverseJoinColumns = @JoinColumn(name = "SpellName")
    )
    private List<Spell> preparedSpells = new ArrayList<>();

    public PlayerCharacter() {}

    // getters and setters
    public Integer getCharID() { return CharID; }
    public void setCharID(Integer charID) { CharID = charID; }

    public String getCharName() { return CharName; }
    public void setCharName(String charName) { CharName = charName; }

    public Integer getCharLevel() { return CharLevel; }
    public void setCharLevel(Integer charLevel) { CharLevel = charLevel; }

    public Integer getSTR() { return STR; }
    public void setSTR(Integer STR) { this.STR = STR; }

    public Integer getCON() { return CON; }
    public void setCON(Integer CON) { this.CON = CON; }

    public Integer getDEX() { return DEX; }
    public void setDEX(Integer DEX) { this.DEX = DEX; }

    public Integer getWIS() { return WIS; }
    public void setWIS(Integer WIS) { this.WIS = WIS; }

    public Integer getINTEL() { return INTEL; }
    public void setINTEL(Integer INTEL) { this.INTEL = INTEL; }

    public Integer getCHA() { return CHA; }
    public void setCHA(Integer CHA) { this.CHA = CHA; }

    public Integer getMaxHP() { return MaxHP; }
    public void setMaxHP(Integer maxHP) { MaxHP = maxHP; }

    //Character Class get/set
    public Classes getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(Classes characterClass) {
        this.characterClass = characterClass;
    }

    //Classe get/set
    public List<Classes> getClasses() {
        return classes;
    }
    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }

    //Species get/set
    public Species getSpecies() { return species; }
    public void setSpecies(Species species) { this.species = species; }

    //Feats get/set
    public List<Feat> getFeats() { return feats; }
    public void setFeats(List<Feat> feats) { this.feats = feats; }

    //Background get/set
    public Background getBackground() { return background; }
    public void setBackground(Background background) { this.background = background; }

    //Weapon get/set
    public List<Weapon> getWeapons() { return weapons; }
    public void setWeapons(List<Weapon> weapons) { this.weapons = weapons; }

    //Spells get/set
    public List<Spell> getPreparedSpells() {
        return preparedSpells;
    }
    public void setPreparedSpells(List<Spell> preparedSpells) {
        this.preparedSpells = preparedSpells;
    }

}
