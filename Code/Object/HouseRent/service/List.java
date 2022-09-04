package Object.HouseRent.service;

import Object.HouseRent.domain.House;

public class List {
    private int size;
    private House[] houses;
    public int houseID = 1;

    public List(int size){
        houses = new House[size];
        houses[0] = new House(houseID, "Jack", "110","NoWhere",2000,"未出租");
    }

    public boolean addHouse(House house){
        if (houseID-1 == houses.length ){
            return false;
        } else houseID++;
        return true;
    }
    public House[] ListA(){
        return houses;
    }
}
