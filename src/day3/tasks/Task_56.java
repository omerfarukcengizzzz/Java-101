package day3.tasks;

public class Task_56 {
    public static void main(String[] args) {

        convertMilesToKM(2);

    }

    //        Write a method that will convert Miles into Kms:

    public static void convertMilesToKM(double miles) {

        double km = miles * 1.6;

        System.out.println(miles + " miles equals to " + km + " kilometers");

    }

}
