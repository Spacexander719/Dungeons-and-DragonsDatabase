package com.dnd.charactercreator.repository;

import com.dnd.charactercreator.model.Feat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeatRepository extends JpaRepository<Feat, String> {}
