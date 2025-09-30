public class Variant10 {

    public static void main(String[] args) {
        task28();
        task29();
        task30();
    }

    // Завдання 28
    public static void task28() {
        double a = 1.478;
        double b = 9.26;
        double c = 0.68;
        double d = 2.24;

        double y = 2 * (Math.log(Math.abs(b / a)) + Math.sqrt(Math.sinh(c) + Math.exp(d)));

        System.out.println("Завдання 28: y = " + y);
    }

    // Завдання 29
    public static void task29() {
        double a = -2.86;
        double b = 1.62;
        double c = 10.874;
        double d = 2.91;

        // arsch(d) = arsinh(d) = ln(d + sqrt(d^2 + 1))
        double arsch = Math.log(d + Math.sqrt(d * d + 1));
        double inside = 2 * Math.cos(Math.sqrt(a / b)) + 4 * arsch;
        double y = Math.pow(inside, c);

        System.out.println("Завдання 29: y = " + y);
    }

    // Завдання 30
    public static void task30() {
        double a = 0.58;
        double b = -0.34;
        double c = 1.25;
        double d = 1.89;

        double numerator = 3 * a;
        double part1 = numerator / Math.cos(a);
        double part2 = Math.sqrt(Math.tanh(Math.abs(b) * c) / Math.log(d));
        double y = part1 + part2;

        System.out.println("Завдання 30: y = " + y);
    }
}
