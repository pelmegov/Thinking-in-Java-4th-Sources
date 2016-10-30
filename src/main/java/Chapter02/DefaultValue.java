package Chapter02;

public class DefaultValue {
    private int i;
    private char ch;
    private byte b;
    private short s;
    private long l;
    private double d;
    private boolean bl;
    private float f;

    public static void main(String[] args) {
        DefaultValue defaultValue = new DefaultValue();
        System.out.println("default int is: " + defaultValue.i);
        System.out.println("default char is: " + defaultValue.ch);
        System.out.println("default byte is: " + defaultValue.b);
        System.out.println("default short is: " + defaultValue.s);
        System.out.println("default long is: " + defaultValue.l);
        System.out.println("default double is: " + defaultValue.d);
        System.out.println("default boolean is: " + defaultValue.bl);
        System.out.println("default float is: " + defaultValue.f);
    }
}