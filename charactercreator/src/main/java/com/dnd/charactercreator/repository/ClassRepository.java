package com.dnd.charactercreator.repository;

import com.dnd.charactercreator.model.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<Classes, String> {
}
