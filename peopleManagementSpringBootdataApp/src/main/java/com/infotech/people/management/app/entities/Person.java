package com.infotech.people.management.app.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "person_table")

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="person_id")
    private int id;

    @Column(name ="first_name",length = 60,nullable = false)
    private String firstName;

    @Column(name ="last_name",length = 60)
    private String lastName;

    @Column(name ="email",unique = true)
    private String email;

    @Column(name ="creation_date")
    private Date creationDate;
    public Person(){

}
    public Person( int id,String firstname, String lastName, String email, Date creationDate){
        super();
        this.id=id;
        this.firstName=firstname;
        this.lastName=lastName;
        this.email=email;
        this.creationDate=creationDate;
    }

    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setId(int id) {
        this.id = id;
    }
}
