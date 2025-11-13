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
private int weightCategory;
private String status;
private List<TashiWazaTechinque> favTechniques = new ArrayList<>(); 
private String ageCategory;


    public Athlete(int id, String userName, String email, String password, String name, LocalDate birthday, String belt, String stance, int weightCategory, String status){
        super(id, userName, email, password);
        this.name = name;
        this.birthday = birthday;
        this.belt = belt;
        this.stance = stance;
        this.age = Period.between(birthday, LocalDate.now()).getYears();
        this.weightCategory = weightCategory;
        this.status = status;
        this.ageCategory = switch (age) {
            case 1,2,3,4,5,6,7,8,9,10,11,12,13,14 -> "PreCadet";
            case 15,16,17 -> "Cadet";
            case 18,19,20 -> "Junior";
            default -> "Senior";
        };

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

    public int getWeightCategory() {
        return weightCategory;
    }

    public String getStatus() {
        return status;
    }

    public String getAgeCategory() {
        return ageCategory;
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

     public void setWeightCategory(int weightCategory) {
        this.weightCategory = weightCategory;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAgeCategory(String ageCategory) {
        this.ageCategory = ageCategory;
    }

}