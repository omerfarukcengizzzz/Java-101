package day4.arrays;

public class String_split {
    public static void main(String[] args) {

        String str = "Dilovar Samiev is a good guy. He loves making empty.";

        String[] arr = str.split("[.]");

        for (String names : arr) {
            System.out.println(names.trim());
        }


        String temp = "123123123123";

        String[] tempArr = temp.split("3");

        for (String t : tempArr) {
            System.out.println(t);
        }
    }
}
