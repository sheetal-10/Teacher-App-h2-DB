package com.bridgelabz.TeacherApp.controller;

import com.bridgelabz.TeacherApp.entity.TeacherEntity;
import com.bridgelabz.TeacherApp.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {
    //crud->
    //reading
    //creating
    //updating
    //deleting

    @Autowired
    private TeacherService teacherService;

    @GetMapping(value = "/teachers")
    public List<TeacherEntity> teachers() {
        return teacherService.teachers();
    }

    @PostMapping(value = "/teacher")
    public TeacherEntity addTeachers(@RequestBody TeacherEntity teacherEntity) {
        return teacherService.addTeachers(teacherEntity);
    }

    @PutMapping(value = "/update-teacher")
    public TeacherEntity updateTeachers(@RequestBody TeacherEntity teacherEntity) {
        return teacherService.updateTeachers(teacherEntity);
    }

}
