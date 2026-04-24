package com.dnd.charactercreator.repository;

import com.dnd.charactercreator.model.Spell;
import com.dnd.charactercreator.model.ClassSpells;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpellRepository extends JpaRepository<Spell, String> {

    @Query("SELECT s FROM Spell s JOIN ClassSpells cs ON s.spellName = cs.spellName " +
            "WHERE cs.className = :className AND s.spellLevel = :level")
    List<Spell> findSpellsByClassAndLevel(@Param("className") String className,
                                          @Param("level") int level);
}
