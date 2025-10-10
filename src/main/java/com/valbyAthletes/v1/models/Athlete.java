package com.valbyAthletes.v1.models;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Athlete{

private int id;
private String name;
private LocalDate birthday;
private int age;
private String belt;
private String stance;
private ArrayList<TashiWazaTechinque> favTechniques = new ArrayList<>(); 


    public Athlete(int id, String name, LocalDate birthday, String belt, String stance){
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.belt = belt;
        this.stance = stance;
        this.age = Period.between(birthday, LocalDate.now()).getYears();
    }

    //----------------------------------GETTER METHODS--------------------------------------------------
    public String getName(){
        return this.name;
    }

    public LocalDate getBirthday(){
        return this.birthday;
    }

    public int getAge(){
        return this.age;
    }

    public ArrayList<TashiWazaTechinque> getFavTechniques(){
        return this.favTechniques;
    }

    public String getBelt(){
        return this.belt;
    }

    public String getStance(){
        return this.stance;
    }

    public int getId(){
        return this.id;
    }
// -------------------------------------SETTER METHODS------------------------------------
    public void setName(String newName){
        this.name = newName;
    }

    public void setBirthday(LocalDate newBirthday){
        this.birthday = newBirthday;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setFavTechniques(ArrayList<TashiWazaTechinque> newTechinques){
        this.favTechniques = newTechinques;
    }

    public void setBelt(String newBelt){
        this.belt = newBelt;
    }

    public void setStance(String newStance){
        this.stance = newStance;
    }

    public void setId(int newId){
        this.id = newId;
    }

}