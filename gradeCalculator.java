import java.util.Scanner;

public class gradeCalculator {
    public static String grade(int average){
        if(average>=90)
            return "A";
        else if(average>=70)
            return "B";
        else if (average>=60)
            return "C";
        else if (average>=40)
            return "D";
        else if (average>=33)
            return "E";
        else
            return "F";
    }
    public static void main(String[] args) {
        System.out.print("Enter the total number of subjects : ");
        int totalSubjects = new Scanner(System.in).nextInt();
        int totalSum = 0;
        System.out.println("Enter the marks of all the subjects");
        for (int i = 1; i<=totalSubjects ; i++)
            totalSum+=new Scanner(System.in).nextInt();
        int average = totalSum/totalSubjects;
        String grade = grade(average);
        display(totalSum,average,grade);
    }
    static void display(int totalSum, int average, String grade){
        System.out.println("--------------RESULT--------------\n");
        System.out.println("Total marks obtained : "+totalSum);
        System.out.println("Average Percentage : "+average);
        System.out.println("Grade : "+grade);
    }
}
