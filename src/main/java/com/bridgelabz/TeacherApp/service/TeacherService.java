package com.bridgelabz.TeacherApp.service;

import com.bridgelabz.TeacherApp.entity.TeacherEntity;
import com.bridgelabz.TeacherApp.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<TeacherEntity> teachers() {
        return teacherRepository.findAll();
    }

    public TeacherEntity addTeachers(TeacherEntity teacherEntity) {
        return teacherRepository.save(teacherEntity);
    }

    public TeacherEntity updateTeachers(TeacherEntity teacherEntity) {
        return teacherRepository.save(teacherEntity);
    }

    public String deleteTeachers(int id) {
        Optional<TeacherEntity> teacherEntity = teacherRepository.findById(id);
        if (teacherEntity.isPresent()) {
            teacherRepository.delete(teacherEntity.get());
            return "Record deleted successfully";
        }
        return "Record does not exists with this id : " + id;
    }
}
