package by.academy.hw1;

public class First {

    private static int a;
    private static String str;
    private static short c;
    private static byte b;

    public static void main(String[] args) {
        int a = 4;
        byte b = (byte) a; /*иначе не получится тк
        byte(1 байт) < int(4 байта) */
        short c = 8;
        int summ = b + c;
        int max = Integer.max(4, 8);
        String str = "5000";
        System.out.println(b);
        System.out.println(summ);
        System.out.println("Max number = " + max);
        System.out.println("Price " + str);
    }
}