package com.bridgelabz.TeacherApp.repository;

import com.bridgelabz.TeacherApp.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity, Integer> {
}
