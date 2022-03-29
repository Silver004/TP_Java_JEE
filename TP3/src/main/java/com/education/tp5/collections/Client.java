package com.education.tp5.collections;

public class Client implements Comparable{
    Integer code;
    String name;

    public Client(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
    //the redefinition of equals and hashCode enables us to get rid of the same objects in a hashset
    @Override
    public boolean equals(Object o){
        Client client = (Client) o;
        return this.code == client.code && this.name.equals(client.name);
    }

    @Override
    public int hashCode(){
        return code;
    }

    //Redefine compareTo method in the comparable interface so that we can sort objects using TreeSet
    @Override
    public int compareTo(Object o){
        Client client = (Client) o;
        return -client.code+this.code;
    }
}
