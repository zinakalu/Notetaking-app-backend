package com.notestaking.Notes.Taking;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date dateCreated;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User owner;
    private String text;
    // private String tags;

    public Notes(){

    }

    public Integer getId(){
        return id;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public User getOwner(){
        return owner;
    }

    public String getText(){
        return text;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setDateCreated(Date dateCreated){
        this.dateCreated = dateCreated;
    }

    public void setOwner(User owner){
        this.owner = owner;
    }

    public void setText(String text){
        this.text = text;
    }

    public String toString(){
        return "id: " + this.id + "date created: " + this.dateCreated + "owner: " + this.owner + "this.text: " + this.text;
    }


}
