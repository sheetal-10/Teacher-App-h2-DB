package com.bridgelabz.TeacherApp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TeacherEntity {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private int rollNo;
}
