/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dylancostello.ct417assignment1;

import java.util.ArrayList;

/**
 *
 * @author Dylan
 */
public class module {
    private String name;
    private String id;
    private ArrayList<student> students;
    
    public module(String name, String id, ArrayList students){
        this.name=name;
        this.id=id;
        this.students=new ArrayList<>();
    }
    
    //Getter and Setter for Name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    //Getter and Setter for ID
   public String getID(){
       return id;
   }
   public void setID(String id){
       this.id=id;
   }
   
   //Register Student to a Module
   public void registerStudent(student s){
       students.add(s);
       s.registerModule(this);
   }
}
