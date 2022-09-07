package Object.HouseRent.service;

import java.util.Arrays;
import Object.HouseRent.domain.House;
import Object.HouseRent.utils.Utility;

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


    public boolean delHouse(House newHouse){
        // 动态删除
        houses = Arrays.copyOf(houses, houses.length);

        return true;
    }


    public boolean del(int numDel){
        for (int i = 0; i<houses.length-1; i++) {
            if (numDel == houses[i].getId()) {
                for (int j = 0; j < houses.length - 1; j++) {
                    houses[j] = houses[j+1];
                }
                houseID--;
                --IDCounter;
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

    public boolean change(int numChange){
        System.out.println("======修改房屋信息======");
        System.out.println("姓名： ");
        String name = Utility.readString(10);
        System.out.println("电话： ");
        String tel = Utility.readString(12);
        System.out.println("地址： ");
        String location = Utility.readString(20);
        System.out.println("月租： ");
        int rentMoney = Utility.readInt();
        houses[numChange -1] = new House(houses[numChange-1].getId(),name,tel,location,rentMoney, "未出租");
        System.out.println(houses[numChange]);
        return true;
    }


    public House[] ListA(){
        return houses;
    }
}
