package Object.HouseRent.view;

import Object.HouseRent.domain.House;
import Object.HouseRent.service.List;
import Object.HouseRent.utils.Utility;

import java.util.Objects;
import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);
    private boolean loop = true;
    private String key;
    private List list = new List();


    // list
    public void HouseList(){
        System.out.println("======房屋列表======");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        House[] houses =list.ListA();
        for (int i = 0; i< houses.length; i++){
            if (houses[i]==null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("======房屋列表显示完毕======");
    }
    public void HouseAdd(){
        System.out.println("======房屋添加======");
        System.out.println("姓名： ");
        String name = Utility.readString(10);
        System.out.println("电话： ");
        String tel = Utility.readString(12);
        System.out.println("地址： ");
        String location = Utility.readString(20);
        System.out.println("月租： ");
        double rentMoney = scanner.nextDouble();
        House house = new House(0,name,tel,location, (int) rentMoney,"未出租");
        if (list.addHouse(house)){
            System.out.println("添加房屋成功");
        }
        System.out.println(house);
    }
    public void HouseDel(){
        System.out.println("======房屋删除======");
        System.out.println("请问您要删除哪个？输入房子的ID编码来进行删除");
        System.out.println("或输入-1来退出");

        int numDel = Utility.readInt();
        if (numDel>list.listNum()){
            System.out.println("不存在您所请求的ID");
        } else if(numDel == -1){
            return;
        } else
        if (list.del(numDel)){
            System.out.println("删除成功");
        }else System.out.println("删除失败");
    }




    public void mainMenu(){
        do {
            System.out.println("\n=============房屋出租系统菜单============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.print("请输入你的选择(1-6): ");
            key = scanner.next();
            if (key.length() != 1){
                System.out.println("你的输入有误，请重新输入");
            }
            switch (key){
                case "1":
                    System.out.println("新增");
                    this.HouseAdd();
                    break;
                case "2":
                    System.out.println("Find");
                    break;
                case "3":
                    System.out.println("Del");
                    this.HouseDel();
                    break;
                case "4":
                    System.out.println("Fix");
                    break;
                case "5":
                    System.out.println("List");
                    this.HouseList();
                    break;
                case "6":
                    System.out.println("Quit");
                    this.Quit();
                default:
                    System.out.println("你必须选择1～6");
            }
        } while (loop);
    }

    public void Quit(){
        System.out.println("-----Quit-----");
        System.out.println("Are you sure you want to quit this program?\n(Y/n)");
        String yes = "y";
        String Yes = "Y";
        String no = "n";
        String quitCommand = Utility.readString(1,"Please type Y/n to conform");
        if (Objects.equals(quitCommand, yes) || quitCommand.equals(Yes)){
            loop = false;
            System.out.println("Goodbye");
        } else if (quitCommand.equals(no)) {
            loop = true;
        } else {
            System.out.println("你的输入有误，请重新输入");
        }

    }
}
