/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dylancostello.ct417assignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author Dylan
 */
public class course {
    private String name;
    private ArrayList modules;
    private ArrayList students;
    private DateTime startDate;
    private DateTime endDate;
    
    private course(String name, ArrayList modules, ArrayList students, DateTime startDate, DateTime endDate){
        this.name=name;
        this.modules=new ArrayList<>();
        this.students=new ArrayList<>();
        this.startDate=startDate;
        this.endDate=endDate;
    }
    
    //Getter and Setter for Name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    //Register Student
    public void registerStudent(student s){
       students.add(s);
       s.registerCourse(this);
   }
    
    //Register Module
    public void registerModule(module m){
        modules.add(m);
        m.registerCourse(this);
    }
    
    //Getter for Registered Students
    public ArrayList getStudents(){
       return students;
    }
    
    //Getter for Modules
    public ArrayList getModules(){
        return modules;
    }
    
    //Getter and Setter for Start Date
    public DateTime getStartDate(){
        return startDate;
    }
    public void setStartDate(DateTime startDate){
        this.startDate=startDate;
    }
    
    //Getter and Setter for End Date
    public DateTime getEndDate(){
        return endDate;
    }
    public void setEndDate(DateTime endDate){
        this.endDate=endDate;
    }
}
