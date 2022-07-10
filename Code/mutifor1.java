import java.util.Scanner;
public class mutifor1 {

    public static void main(String[]args) {
        Scanner myScanner = new Scanner(System.in);
        int student_num1;
        int student_sum = 0;
        int not_good = 0;
        System.out.println("How many class?");
        int classNum = myScanner.nextInt();
        System.out.println("There's "+ classNum+ " class in total");
        for (int classNum_for = 1; classNum_for<=classNum; classNum_for++){
            System.out.println("Class"+ classNum_for);
            // print class number
            System.out.println("How many students?");
            student_num1 = myScanner.nextInt();
            // count stud_net number

            for (int i = 1;i<=student_num1;i++){
                // for circle
                System.out.println("Student's Grade?");
                // student grade record
                int student_grade = myScanner.nextInt(); 
                student_sum += student_grade;
                // sum up student grade
                // judge not_good student number
                if (student_grade <= 6){
                    not_good++;
                } else {
                    continue;
                }
            }

            System.out.println("Class "+ classNum_for + "'s sum is = "+student_sum/classNum_for);
            System.out.println(classNum_for + " class average "+ "is = "+student_sum/student_num1/classNum_for);
            System.out.println("There's "+ not_good + " student in Class " + classNum_for + " is not good at this");
    }
    }
}
