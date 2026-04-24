package com.dnd.charactercreator.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Weapons")
public class Weapon {

    @Id
    @Column(name = "WeaponName")
    private String weaponName;

    private String Distance;
    private String DamageType;
    private String Properties;
    private String DamageDice;

    public Weapon() {}

    public String getWeaponName() { return weaponName; }
    public void setWeaponName(String weaponName) { this.weaponName = weaponName; }

    public String getDistance() { return Distance; }
    public void setDistance(String distance) { Distance = distance; }

    public String getDamageType() { return DamageType; }
    public void setDamageType(String damageType) { DamageType = damageType; }

    public String getProperties() { return Properties; }
    public void setProperties(String properties) { Properties = properties; }

    public String getDamageDice() { return DamageDice; }
    public void setDamageDice(String damageDice) { DamageDice = damageDice; }

    @Override
    public String toString() {
        return weaponName;
    }
}
