import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        if (a < 0) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Независимо от того что произошлов в try и catch, будет выведена в консоль эта запись");
            }
        }
    }
}