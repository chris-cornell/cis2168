/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3linkedstackqueue;

import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class Person {

    private String name;
    private int age;
    private ArrayList<String> skills = new ArrayList<String>();

    public Person() {
        name = "Chris";
        age = 20;
        skills.add("Java");
        skills.add("C");
        skills.add("C#");
        skills.add("Python");
    }

    public Person(String name) {
        this.name = name;
        age = 20;
    }

    public Person(String name, int age, ArrayList<String> skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public String toString() {
        return name/* + "is " + age + " and is good at: " + skills*/; // For the sake of space while testing, I only want to display the name.
    }
}
