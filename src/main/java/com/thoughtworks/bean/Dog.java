package com.thoughtworks.bean;

public class Dog {

    private Person owner;

    public Dog() {
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String bark() {
        return "wang wang " + owner.getName();
    }
}
