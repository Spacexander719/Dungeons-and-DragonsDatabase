package com.dnd.charactercreator.repository;

import com.dnd.charactercreator.model.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeaponRepository extends JpaRepository<Weapon, String> {}
