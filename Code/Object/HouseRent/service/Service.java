package Object.HouseRent.service;

import Object.HouseRent.domain.House;

public class Service {
    // 房屋信息
    private int id;
    private String name;
    private String phone;
    private String location;
    private double rentMoney;
    private String state;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRentMoney() {
        return rentMoney;
    }

    public void setRentMoney(double rentMoney) {
        this.rentMoney = rentMoney;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Service(int id, String name, String phone, String location, double rentMoney, String state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.location = location;
        this.rentMoney = rentMoney;
        this.state = state;
    }

    @Override
    public String toString() {
        return  id +
                "\t\t" + name +
                "\t" + phone +
                "\t\t" + location +
                "\t" + rentMoney +
                "\t" + state ;
    }
}
