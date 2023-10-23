package ru.manyanov.CRUD_AirBnb.models;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "flats2")
@RequiredArgsConstructor
public class Flat {
    @Id
    @Column(name = "id_houses")
    @SequenceGenerator(name = "flats2_seq", sequenceName = "flats2_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "flats2_seq")
    private int id;

    @Column(name = "area")
    private int area;

    @Column(name = "countofrooms")
    private int countsOfRooms;

    @Column(name = "name_house")
    private String nameHouses;

    @Column(name = "house_description")
    private String houseDescription;

    @Column(name = "address")
    private String address;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getCountsOfRooms() {
        return countsOfRooms;
    }

    public void setCountsOfRooms(int countsOfRooms) {
        this.countsOfRooms = countsOfRooms;
    }

    public String getNameHouses() {
        return nameHouses;
    }

    public void setNameHouses(String nameHouses) {
        this.nameHouses = nameHouses;
    }

    public String getHouseDescription() {
        return houseDescription;
    }

    public void setHouseDescription(String houseDescription) {
        this.houseDescription = houseDescription;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Flat(int area, int countsOfRooms, String nameHouses, String houseDescription, String address) {
        this.area = area;
        this.countsOfRooms = countsOfRooms;
        this.nameHouses = nameHouses;
        this.houseDescription = houseDescription;
        this.address = address;
    }
}
