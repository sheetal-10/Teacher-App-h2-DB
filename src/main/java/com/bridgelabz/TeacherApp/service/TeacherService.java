package com.bridgelabz.TeacherApp.service;

import com.bridgelabz.TeacherApp.entity.TeacherEntity;
import com.bridgelabz.TeacherApp.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<TeacherEntity> teachers() {
        return teacherRepository.findAll();
    }
}
