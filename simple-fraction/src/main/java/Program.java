public class Program {
    public static void main(String[] args) {
        Pair pair1, pair2;
        Rational fraction1, fraction2;
        Pair difference, sum, product;

        // Проверка на равенство:
        pair1 = new Pair(1, 2);
        pair2 = new Pair(1, 2);
        if (pair1.equals(pair2)) {
            System.out.println(String.format("%s == %s", pair1, pair2));
            // 1/2 == 1/2
        } else {
            System.out.println(String.format("%s != %s", pair1, pair2));
        }

        System.out.println();

        // Проверка на неравенство:
        pair1 = new Pair(5, 2);
        pair2 = new Pair(1, 6);
        if (pair1.equals(pair2)) {
            System.out.println(String.format("%s == %s", pair1, pair2));
        } else {
            System.out.println(String.format("%s != %s", pair1, pair2));
            // 5/2 != 1/6
        }

        System.out.println();

        // Вычитание пар:
        pair1 = new Pair(5, 8);
        pair2 = new Pair(1, 6);
        difference = pair1.subtract(pair2);
        System.out.println(String.format("%s - %s = %s", pair1, pair2, difference));
        // (5, 8) - (1, 6) = (4, 2)

        System.out.println();

        // Вычитание:
        fraction1 = new Rational(19, 21);
        fraction2 = new Rational(11, 15);
        difference = fraction1.subtract(fraction2);
        System.out.println(String.format("%s - %s = %s", fraction1, fraction2, difference));
        // 19/21 - 11/15 = 6/35
        System.out.println(String.format("Перемножение полей результата: %d", difference.multiply()));
        // Перемножение полей разности: 210

        System.out.println();

        // Сложение:
        fraction1 = new Rational(5, 42);
        fraction2 = new Rational(10, 63);
        sum = fraction1.add(fraction2);
        System.out.println(String.format("%s + %s = %s", fraction1, fraction2, sum));
        // 5/42 + 10/63 = 5/18
        System.out.println(String.format("Перемножение полей суммы: %d", sum.multiply()));
        // Перемножение полей суммы: 90

        System.out.println();

        // Умножение:
        fraction1 = new Rational(24, 35);
        fraction2 = new Rational(25, 36);
        product = fraction1.multiply(fraction2);
        System.out.println(String.format("%s * %s = %s", fraction1, fraction2, product));
        // 24/35 * 25/36 = 10/21
        System.out.println(String.format("Перемножение полей результата: %d", product.multiply()));
        // Перемножение полей произведения: 210

    }
}