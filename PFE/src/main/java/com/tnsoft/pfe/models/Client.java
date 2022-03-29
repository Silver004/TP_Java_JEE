package com.tnsoft.pfe.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name="TClients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @Column
    public String name;
    public Client(long id, String name){
        this.id = id;
        this.name = name;
    }
    public Client(){}

}
