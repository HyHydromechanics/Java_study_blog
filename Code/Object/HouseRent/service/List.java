package Object.HouseRent.service;

import java.util.Arrays;
import Object.HouseRent.domain.House;

public class List {
    private int size = 3;
    private House[] houses;
    public int houseID = 1;
    private int IDCounter = 1;


    public int listNum(){
        return houses.length;
    }


    public List(){
        houses = new House[size];
        houses[0] = new House(IDCounter, "Jack", "110","NoWhere",2000,"未出租");

    }

    public boolean addHouse(House newHouse){
        // 动态扩容
        houses = Arrays.copyOf(houses, houses.length+1);

        houses [houseID++] = newHouse;
        newHouse.setId(++IDCounter);
        return true;
    }

    public boolean delHouse(House newHouse){
        // 动态删除
        houses = Arrays.copyOf(houses, houses.length-1);
        houseID--;
        IDCounter--;
        return true;
    }


    public House[] ListA(houses){
        return houses;
    }
}
