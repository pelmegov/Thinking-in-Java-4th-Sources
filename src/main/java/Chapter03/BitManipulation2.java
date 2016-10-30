package Chapter03;

public class BitManipulation2 {

    public static void main(String[] args) {

        int a = 105;
        int b = 99;

        printBinaryInt("a", a);
        printBinaryInt("b", b);
        System.out.println(" ");

//        System.out.println("Поразрядная унарная операция НЕ");
//        System.out.println("\"Поразрядное отрицание\"");
//        printBinaryInt("~a", ~a);
//        printBinaryInt("~b", ~b);

//        System.out.println("Отрицательные числа");
//        printBinaryInt("-a", -a);
//        printBinaryInt("-b", -b);

//        System.out.println("Поразрядная логическая операция И");
//        printBinaryInt("a & b", a & b);

//        System.out.println("Поразрядная логическая операция ИЛИ");
//        printBinaryInt("a | b", a | b);

//        System.out.println("Поразрядная логическая операция исключающее ИЛИ");
//        printBinaryInt("a ^ b", a ^ b);

//        System.out.println("Сдвиг вправо");
//        printBinaryInt("a >> b", a >> 1);

//        System.out.println("Сдвиг вправо с заполнением нулями");
//        printBinaryInt("a >>> b", a >>> 1);

//        System.out.println("Сдвиг влево");
//        printBinaryInt("a << b", a << 1);
    }

    private static void printBinaryInt(String s, int i) {
        System.out.println(s + ", int: " + i + ", binary:\n    " + Integer.toBinaryString(i));
    }

}
