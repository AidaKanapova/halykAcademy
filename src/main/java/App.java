
public class App {
    public static void main(String[] args) {

        triangle(8);
    }

    public static void triangle(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
