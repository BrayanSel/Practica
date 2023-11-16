/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona_poli;

/**
 *
 * @author User
 */
public class Professor extends Persona{
    protected String subject;
    protected int salary;
    
    public void list(){
        System.out.println("Hola paso lista");
    }
    public void saludoP(){
        System.out.println("Hola estudiantes");
    }
    
    
    
    
    //Setter and Getters

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    

   
    

    
    
    
    
}
