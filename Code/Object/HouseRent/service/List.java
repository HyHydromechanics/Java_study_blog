package Object.HouseRent.service;

import Object.HouseRent.domain.House;

public class List {
    private int size;
    private House[] houses;
    public List(int size){
        houses = new House[size];
        houses[0] = new House(1, "Jack", "110","NoWhere",2000,"未出租");
    }
    public House[] ListA(){
        return houses;
    }
}
