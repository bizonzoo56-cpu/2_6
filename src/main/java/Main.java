public class Main {
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit");
        System.out.println("---------------------");

        for (int c = 0; c <= 300; c += 20) {
            double f = c * 9.0 / 5.0 + 32;
            System.out.printf("%7d\t%10.2f%n", c, f);
        }
    }
}
