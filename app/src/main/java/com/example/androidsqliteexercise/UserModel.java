package com.example.androidsqliteexercise;

public class UserModel {
    private int id;
    private String name;
    private int passcode;

    //constructor

    public UserModel(int id, String name, int passcode) {
        this.id = id;
        this.name = name;
        this.passcode = passcode;
    }

    public UserModel() {
    }

    //toString

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passcode=" + passcode +
                '}';
    }

    //getters setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPasscode() {
        return passcode;
    }

    public void setPasscode(int passcode) {
        this.passcode = passcode;
    }
}
