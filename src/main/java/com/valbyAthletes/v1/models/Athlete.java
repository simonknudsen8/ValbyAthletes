package com.valbyAthletes.v1.models;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Athlete extends User{

private String name;
private LocalDate birthday;
private int age;
private String belt;
private String stance;
private List<TashiWazaTechinque> favTechniques = new ArrayList<>(); 


    public Athlete(int id, String userName, String email, String password, String name, LocalDate birthday, String belt, String stance){
        super(id, userName, email, password);
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

    public List<TashiWazaTechinque> getFavTechniques(){
        return this.favTechniques;
    }

    public String getBelt(){
        return this.belt;
    }

    public String getStance(){
        return this.stance;
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

    public void setFavTechniques(List<TashiWazaTechinque> newTechinques){
        this.favTechniques = newTechinques;
    }

    public void setBelt(String newBelt){
        this.belt = newBelt;
    }

    public void setStance(String newStance){
        this.stance = newStance;
    }


}