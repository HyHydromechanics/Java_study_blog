public class circleWork7 {
    public static void main(String []args){
        double front = 1;
        double sum = 0;
        for (;front<=100;front++){
            if (front%2 == 0){
                sum -= 1/front;
            } else if (front%2!=0) {
                sum += 1/front;
            }
        }
        System.out.println("Answer = " + sum);

    }
}
