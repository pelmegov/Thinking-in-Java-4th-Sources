package Chapter02;

class Entity {
    private static int staticNum;

    Entity() {
        staticNum++;
    }

    static void printStaticNum() {
        System.out.println(staticNum);
    }
}

public class StaticClassOnly {
    public static void main(String[] args) {
        Entity array[] = new Entity[10];
        for (int i = 0; i < 10; ++i) {
            array[i] = new Entity();
        }
        Entity.printStaticNum();
    }
}