package Object.HouseRent.view;

public class View {
    private boolean loop = true;
    private char key;
    public void mainMenu(){
        do{
            System.out.println("房屋出租系统菜单");
        } while (loop);
    }
}
