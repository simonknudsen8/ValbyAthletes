package com.valbyAthletes.v1.models;

public class User{

    private int id;
    private String userName;
    private String email;
    private String password; //should be hash, need to learn how to do it


    public User(int id, String userName, String email ,String password){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }


//-------------------------------------------GETTER METHODS---------------------------------------
    public int getId(){
        return this.id;
    }

    public String getUserName(){
        return this.userName;
    }

    public String getEamil(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

//-----------------------------------Setter Methods-----------------------------------------------

    public void setId(int newID){
        this.id = newID;
    }

    public void setUserName(String newName){
        this.userName = newName;
    }

    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    public void setPassword(String newPassword){
        this.password = newPassword;
    }


}