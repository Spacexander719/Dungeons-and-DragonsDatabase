package com.dnd.charactercreator.repository;

import com.dnd.charactercreator.model.PlayerCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PlayerCharacterRepository extends JpaRepository<PlayerCharacter, Integer> {
    List<PlayerCharacter> findByCharNameContaining(String name);
}
