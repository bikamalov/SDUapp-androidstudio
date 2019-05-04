package com.example.sduapp;

public class Staff {
    public String name;
    public String department;
    public String position;
    public int Photo;

    public Staff(String name, String department, String position, int photo) {
        this.name = name;
        this.department = department;
        this.position = position;
        Photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
