import sun.lwawt.macosx.CSystemTray;
/**
 * @author wangrundong
 */
public class Star {
    public static void main(String []args){
        int i = 1;
        for (; i <= 5;i++){
            for(int j = 1; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
    }
}
