package com.example.emildetektywi.models;


import javax.persistence.*;

@Entity
@Table(name="client")
public class Client {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;



    @Column(nullable = false)
    private String name;
    // basic, premium
    @Column(nullable = false,length=100)
    private String membershipCat;

    public long getMonthlyDues() {
        return monthlyDues;
    }

    public void setMonthlyDues(long monthlyDues) {
        this.monthlyDues = monthlyDues;
    }

    @Column
    private long monthlyDues;

//    @Column(nullable = false)
//    private long height;
//    @Column(nullable=false)
//    private long weight;

    public Client(Client copy) {
        this.id = copy.id;
        this.name = copy.name;
        this.membershipCat = copy.membershipCat;
        this.monthlyDues = copy.monthlyDues;
//        this.height = copy.height;
//        this.weight = copy.weight;
    }

    public Client() {
    }

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

    public String getMembershipCat() {
        return membershipCat;
    }

    public void setMembershipCat(String membershipCat) {
        this.membershipCat = membershipCat;
    }

    public void setName() {
    }
//
//    public long getHeight() {
//        return height;
//    }
//
//    public void setHeight(long height) {
//        this.height = height;
//    }
//
//    public long getWeight() {
//        return weight;
//    }
//
//    public void setWeight(long weight) {
//        this.weight = weight;
//    }

 

}
