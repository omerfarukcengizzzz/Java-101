package day4.arrays;

public class MyArrays {
    public static void main(String[] args) {

        String name = "Dilovar";
        int num = 1;

        String[] nameList = {
                "Omer",
                "Faruk",
                "Dilovar",
                "Samiev"
        };

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(nameList[3]);
        System.out.println(numbers[4]);



        // instantiating arrays
        int temp[] = new int[10];

        temp[0] = 5;
        temp[5] = 6;

        // for loop
        for (int i = 0; i < temp.length; i++) {
            System.out.println("temp[" + i + "] = " + temp[i]);
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }



        // foreach loop

        //  for (int i = 0; i < nameList.length; i++) {
        //      System.out.println(nameList[i]);
        //  }

        for (String list : nameList) {
            System.out.println(list);
        }

        for (int nums : numbers) {
            System.out.println(nums);
        }

    }
}
