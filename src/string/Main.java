package string;


public class Main
{
    public static void main(String[] args) {
        String str = "Java - строго типизированный объектно-ориентированный язык программирования, разработанный компанией Sun Microsystems в последующем приобретённой компанией Oracle";
        String str2 = "Java - строго типизированный объектно-ориентированный язык программирования";

        //Задание 1
        System.out.println("Задание 1: " + str.length());
        //Задание 2
        System.out.println("Задание 2: " + str.compareToIgnoreCase(str2));
        // Задание 3
        String str3 = new String ("Java - строго типизированный объектно-ориентированный язык программирования, разработанный компанией Sun Microsystems в последующем приобретённой компанией Oracle");
        str3 = str3.intern();
        //Задание 4
        str3 = str3 + " - строго типизированный объектно-ориентированный язык программирования";
        //Задание 5
        String str4 = "Java";
        str4 = str4.concat(" - строго типизированный объектно-ориентированный язык программирования");
        //Задание 6
        char[] list = str.toCharArray();
        //Задание 7
        byte[] list2 = str.getBytes();
        //Задание 8
        System.out.println("Задание 8: " + str.toUpperCase());
        //Задание 9 (Английская буква a)
        System.out.println("Задание 9: " + str.indexOf('a'));
        //Задание 10 (Английская буква a)
        System.out.println("Задание 10: " + str.lastIndexOf('a'));
        //Задание 11
        System.out.println("Задание 11: " + str.contains("Sun"));
        //Задание 12
        System.out.println("Задание 12: " + str.endsWith("Oracle"));
        //Задание 13
        System.out.println("Задание 13: " + str.startsWith("Java"));
        //Задание 14 (Замена английского символа "a" на английский символ "o")
        System.out.println("Задание 14: " + str.replace("a","o"));
        //Задание 15
        System.out.println("Задание 15: " + str.substring(44,90));
        //Задание 16
        System.out.println("Задание 16: ");
        for (String strP : str.split(" ")){
            System.out.println(strP);
        };
        //Задание 17
        StringBuilder stringBuilder = new StringBuilder(str);
        //Задание 18
        System.out.println("Задание 18: " + stringBuilder.append('.'));
        //Задание 19
        System.out.println("Задание 19: " + stringBuilder.delete(stringBuilder.indexOf(","),stringBuilder.indexOf("Oracle")+6));
        //Задание 20
        System.out.println("Задание 20: " + stringBuilder.reverse());
    }
}
