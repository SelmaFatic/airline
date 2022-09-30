package com.moja.airline.entity.ticket;


import com.moja.airline.entity.destination.Destination;
import com.moja.airline.entity.user.User;
import jdk.jfr.DataAmount;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="ticket", schema = "Airline")
public class Ticket  {
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long Id;

    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    @Basic(optional = false)
    @Column(name = "surname")
    private String surname;


    @Basic(optional = false)
    @Column(name = "date_of_departure")
    private Date date_of_departure;


    @Basic(optional = false)
    @Column(name = "date_of_arival")
    private Date date_of_arrival;

    @Basic(optional = false)
    @Column(name = "number_of_passengers")
    private long number_of_passengers;

    @Basic(optional = false)
    @Column(name = "your_destination")
    private String your_destination;


    @ManyToMany
    @JoinTable(
            name="ticket_user",
            joinColumns = @JoinColumn(name="ticket_id", referencedColumnName ="id"),
            inverseJoinColumns = @JoinColumn(name="user_id",referencedColumnName = "Id")
    )
    private List<User>users;




    public Ticket() {

    }

    public List<User> users() {
        return users;
    }

    public void setTicketsUsers(List<User> ticketsUsers) {
        this.users = users;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDate_of_departure() {
        return date_of_departure;
    }

    public void setDate_of_departure(Date date_of_departure) {
        this.date_of_departure = date_of_departure;
    }

    public Date getDate_of_arrival() {
        return date_of_arrival;
    }

    public void setDate_of_arrival(Date date_of_arrival) {
        this.date_of_arrival = date_of_arrival;
    }

    public long getNumber_of_passengers() {
        return number_of_passengers;
    }

    public void setNumber_of_passengers(long number_of_passengers) {
        this.number_of_passengers = number_of_passengers;
    }

    public String getYour_destination() {
        return your_destination;
    }

    public void setYour_destination(String your_destination) {
        this.your_destination = your_destination;
    }





}





















