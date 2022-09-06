package Object.HouseRent.service;

import java.util.Arrays;
import Object.HouseRent.domain.House;

public class List {
    private int size = 2;
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

    //  似乎没用，再看看
    public boolean delHouse(House newHouse){
        // 动态删除
        houses = Arrays.copyOf(houses, houses.length-1);
        houseID--;
        IDCounter--;
        return true;
    }

    public boolean del(int numDel){
        for (int i = 0; i<houses.length-1; i++) {
            if (numDel == houses[i].getId()) {
                for (int j = 0; j < houses.length - 1; j++) {
                    houses[j] = houses[j+1];
                }
                houseID--;
                IDCounter--;
                houses = Arrays.copyOf(houses, houses.length - 1);
                return true;
            }
        }
        return false;
    }

    public boolean find(int numFind){
        int i = 0;
        for (;i<houses.length-1; i++){
            if (numFind == houses[i].getId()){
                System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
                System.out.println(houses[numFind-1]);
            }
        }
        return true;
    }


    public House[] ListA(){
        return houses;
    }
}
