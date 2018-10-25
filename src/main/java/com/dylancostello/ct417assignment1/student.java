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
public class student {
    private String name;
    private int age;
    private DateTime dob;
    private String id;
    private String username;
    private ArrayList<module> modules;
    
    
   public student(String name, int age, DateTime dob, String id, ArrayList modules){
       this.name=name;
       this.age=age;
       this.dob=dob;
       this.id=id;
       this.modules=new ArrayList<>();
   }
   
   //Getter and Setter for Name
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name=name;
   }
   
   //Getter and Setter for Age
   public int getAge(){
       return age;
   }
   public void setAge(int age){
       this.age=age;
   }
   
   //Getter and Setter for Date of Birth
   public DateTime getDOB(){
       return dob;
   }
   public void setDOB(DateTime dob){
       this.dob=dob;
   }
   
   //Getter and Setter for ID
   public String getID(){
       return id;
   }
   public void setID(String id){
       this.id=id;
   }
   
   //Getter for Username
   public String getUsername(){
       this.username=this.name+this.age;
       return username;
   }
   
   //Register Student for Module
   public void registerModule(module m){
       modules.add(m);
   }
}
