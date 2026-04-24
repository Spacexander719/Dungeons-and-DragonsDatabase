package com.dnd.charactercreator.repository;

import com.dnd.charactercreator.model.Species;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeciesRepository extends JpaRepository<Species, String> {}
