package day2.string;

public class StringManipulation {
    public static void main(String[] args) {

        String str = "       Dilovar Samiev      345";

        System.out.println(str.charAt(6));
        System.out.println(str.length());
        System.out.println(str.concat(" Samiev"));
        System.out.println(str.contains("ov"));
        System.out.println(str.endsWith("ar"));
        System.out.println(str.equals("dilovar"));
        System.out.println(str.equalsIgnoreCase("dIlOVaR"));
        System.out.println(str.indexOf("v"));
        System.out.println(str.isEmpty());
        System.out.println(str.replace("D", "C"));

//        String[] arr = str.split(" ");
//
//        System.out.println(arr);

        System.out.println(str.startsWith("D"));

        System.out.println(str.substring(2, 5));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());


    }
}
