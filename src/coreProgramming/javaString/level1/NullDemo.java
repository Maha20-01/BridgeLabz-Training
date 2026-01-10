package level1;

public class NullDemo {

    public static void gen() {
        String text = null;
        text.length();
    }

    public static void handle() {
        String text = null;
        try {
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {
        gen();
        handle();
    }
}
