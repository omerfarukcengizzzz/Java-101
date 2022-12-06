package day4.tasks;

public class Task_86 {
    public static void main(String[] args) {

        System.out.println(months(213));

    }


    public static String months(int i) {

        if (i <= 0 || i >= 13) {
            System.out.println("invalid number, range should be between 1-12");
        } else {
            String monthsList[] = {
                    "January",
                    "February",
                    "March",
                    "April",
                    "May",
                    "June",
                    "July",
                    "August",
                    "September",
                    "October",
                    "November",
                    "December"
            };

            return monthsList[i - 1];
        }

        return null;
    }
}
