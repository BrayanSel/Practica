/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona_poli;

/**
 *
 * @author User
 */
public class Persona_poli {

    public static void main(String[] args) {
        
        //Inheritance
        System.out.println("Inheritance");
        
        Student stu = new Student();
        stu.setAge(17);
        stu.present();
        System.out.println("Hola soy un estudiante y tengo "+ stu.getAge() + " años");
        stu.hello();
        
        
        Professor pro = new Professor();
        pro.setSalary(150000);
        pro.list();
        System.out.println("Hola soy un profesor, mi salario es de "+ pro.getSalary());
        
        
        System.out.println("Poliformismo");
        //Poliformismo
        
        Persona stu1 = new Student();
        Persona prof1 = new Professor();
        
        //Metodos de Persona
        stu1.hello();
        prof1.bye();
        
        stu1.setName("Samuel");
        System.out.println("Hola soy "+stu1.getName());
        prof1.setName("Eric");
        System.out.println("Hola soy " + prof1.getName());
    }
}
