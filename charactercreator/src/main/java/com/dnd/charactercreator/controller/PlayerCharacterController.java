package com.dnd.charactercreator.controller;

import com.dnd.charactercreator.model.Classes;
import com.dnd.charactercreator.model.PlayerCharacter;
import com.dnd.charactercreator.model.Spell;
import com.dnd.charactercreator.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/characters")
public class PlayerCharacterController {

    @Autowired
    private PlayerCharacterRepository characterRepo;

    @Autowired
    private ClassRepository classRepo;

    @Autowired
    private SpeciesRepository speciesRepo;

    @Autowired
    private FeatRepository featRepo;

    @Autowired
    private BackgroundRepository backgroundRepo;

    @Autowired
    private WeaponRepository weaponRepo;

    @Autowired
    private SpellRepository spellRepo;


    // LIST CHARACTERS
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("characters", characterRepo.findAll());
        return "characters/list";
    }


    // CREATE FORM
    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("character", new PlayerCharacter());
        model.addAttribute("classes", classRepo.findAll());
        model.addAttribute("species", speciesRepo.findAll());
        model.addAttribute("feats", featRepo.findAll());
        model.addAttribute("backgrounds", backgroundRepo.findAll());
        model.addAttribute("weapons", weaponRepo.findAll());
        return "characters/create";
    }


    // CREATE POST
    @PostMapping("/create")
    public String create(@ModelAttribute PlayerCharacter pc,
                         @RequestParam("characterClass") String className) {

        Classes selectedClass = classRepo.findById(className).orElseThrow();
        pc.setCharacterClass(selectedClass);

        characterRepo.save(pc);
        return "redirect:/characters/list";
    }


    // VIEW CHARACTER SHEET
    @GetMapping("/{id}")
    public String viewCharacter(@PathVariable int id, Model model) {

        PlayerCharacter pc = characterRepo.findById(id).orElseThrow();

        String className = pc.getCharacterClass().getClassName();

        List<Spell> cantrips = spellRepo.findSpellsByClassAndLevel(className, 0);
        List<Spell> level1spells = spellRepo.findSpellsByClassAndLevel(className, 1);
        List<Spell> level2spells = spellRepo.findSpellsByClassAndLevel(className, 2);

        model.addAttribute("pc", pc);
        model.addAttribute("cantrips", cantrips);
        model.addAttribute("level1spells", level1spells);
        model.addAttribute("level2spells", level2spells);

        return "characters/view";
    }


    // EDIT FORM
    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Integer id, Model model) {
        model.addAttribute("character", characterRepo.findById(id).orElseThrow());
        model.addAttribute("classes", classRepo.findAll());
        model.addAttribute("species", speciesRepo.findAll());
        model.addAttribute("feats", featRepo.findAll());
        model.addAttribute("backgrounds", backgroundRepo.findAll());
        model.addAttribute("weapons", weaponRepo.findAll());
        return "characters/edit";
    }


    // EDIT POST
    @PostMapping("/edit")
    public String edit(@ModelAttribute PlayerCharacter pc) {
        characterRepo.save(pc);
        return "redirect:/characters/list";
    }


    // DELETE
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        characterRepo.deleteById(id);
        return "redirect:/characters/list";
    }
}
