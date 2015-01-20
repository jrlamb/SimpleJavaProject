/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.company.app;

import br.com.company.model.Person;

/**
 *
 * @author Juliano
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Main method");
        
        //Inicializing the objects
        Person person = new Person("Juliano Rodrigo", "Lamb", 'm', 1.81, 82.1);
        StringBuilder informations = new StringBuilder();
        
        informations.append("Reflecting the object: {");
        informations.append("\n\tFirst name: ").append(person.getFirstName());
        informations.append("\n\tLast name: ").append(person.getLastName());
        informations.append("\n\tGender: ").append(person.getGender());
        informations.append("\n\tHeight: ").append(person.getHeight());
        informations.append("\n\tWeight: ").append(person.getWeight());
        informations.append("\n\tIMC: ").append(person.getIMC());
        informations.append("\n}");
        
        System.out.println(informations.toString());
                
    }
    public void printIMCOnConsole(Person p){
    
        System.out.println(p.getIMC());
    }
}
