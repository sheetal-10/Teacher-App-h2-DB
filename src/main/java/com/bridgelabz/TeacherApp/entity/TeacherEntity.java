package com.bridgelabz.TeacherApp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class TeacherEntity {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private int rollNo;
}
