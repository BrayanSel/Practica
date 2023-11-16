/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona_poli;

/**
 *
 * @author User
 */
public class Student extends Persona{
    protected int grade;
    protected String group;

    public void present(){
        System.out.println("Presente profe");
    }
    
    public void bye_stu(){
        System.out.println("Adios profe");
    }
    
    
    
    //Setter and getters
    
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    
    
    
}
