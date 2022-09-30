package com.moja.airline.entity.destination;

//import com.moja.airline.entity.ticket.TicketItem;

import javax.persistence.*;
        import java.math.BigDecimal;

@Entity
@Table(name = "destination", schema = "Airline")
public class Destination  {

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long Id;

    @Basic(optional = false)
    @Column(name = "city")
    private String City;

    @Basic(optional = false)
    @Column(name = "state")
    private String State;

    @Basic(optional = false)
    @Column(name = "destination_price")
    private BigDecimal destinationPrice;








    public Destination() {
    }



    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }


    public Long getDestinationId() {
        return Id;
    }

    public void setDestinationId(Long Id) {
        this.Id = Id;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public BigDecimal getDestinationPrice() {
        return destinationPrice;
    }

    public void setDestinationPrice(BigDecimal destinationPrice) {
        this.destinationPrice = destinationPrice;
    }






    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Destination destination = (Destination) o;

        return Id != null ? Id.equals(destination.Id) : destination.Id == null;
    }


}
