public class App {
    public static void main(String[] args) {
        int x = 14;
        int y = 15;

        System.out.println(x % 2 == 0 && y % 2 == 1);
        System.out.println(x % 2 == 0 || y % 2 == 0);
        System.out.println(x % 2 == 0 && y % 2 == 0);
        System.out.println(x % 2 != 0 && y % 2 != 0);
    }

}
