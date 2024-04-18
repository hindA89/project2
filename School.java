/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.myschool;

import java.util.ArrayList;

/**
 *
 * @author Hindallami
 */
public class School {
    private int id;
    private String name;
    private ArrayList<Department> deptList;
    private ArrayList < Student> studentList;

    public School(int id, String name, ArrayList<Department> deptList, ArrayList<Student> studentList) {
        this.id = id;
        this.name = name;
        this.deptList = deptList;
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
}
