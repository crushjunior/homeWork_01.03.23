import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int a = 1;
            try {
                doSmth(a);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Независимо от того что произошлов в try и catch, будет выведена в консоль эта запись");
            }

    }

    public static void doSmth(int a) throws IOException {
        if (a < 0) {
            throw new IOException("Меньше нуля");
        }
    }
}