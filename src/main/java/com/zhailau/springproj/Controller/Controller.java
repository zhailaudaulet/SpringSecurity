package com.zhailau.springproj.Controller;

import com.zhailau.springproj.Data.Habits;
import com.zhailau.springproj.Repo.HabitsRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:3000")
public class Controller {
    private final HabitsRepo habitsRepo;
    @Autowired
    public Controller(HabitsRepo habitsRepo) {
        this.habitsRepo = habitsRepo;
    }

    @GetMapping( "/get-habits")
    public List<Habits> getHabits(){
        return habitsRepo.findAll();
    }

    @PostMapping( "/save-habit")
    public String saveHabit(@RequestBody Habits habits){
        habitsRepo.save(habits);
        return "Saved...";
    }


}
