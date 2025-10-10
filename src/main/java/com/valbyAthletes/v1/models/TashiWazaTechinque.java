package com.valbyAthletes.v1.models;

public class TashiWazaTechinque {

    private int id;
    private String name;
    private String type;
    

    public TashiWazaTechinque(int id, String name, String type){
        this.id = id;
        this.name = name;
        this.type = type;
    }

    //-----------------------------------GETTER METHODS---------------------------------------

    public int getID(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

//--------------------------------------------SETTER METHODS---------------------------------------


    public void setID(int newID){
        this.id = newID;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setType(String newType){
        this.type = newType;
    }
}
