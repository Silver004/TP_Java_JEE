package com.education.tp3;

public class Client {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client(){
        System.out.println("Accessing client constructor...");
    }
    public Client(long id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "The client has the id " + this.id + " and the name " + this.name;
    }

}
