
/**
 * Простая дробь.
 */
public class Rational extends Pair {

    /**
     * Конструктор.
     *
     * @param numerator    числитель.
     * @param denominator  знаменатель.
     */
    public Rational(int numerator, int denominator) {
        super(numerator, denominator);

        // Сокращение дроби:
        int gcd = greatestCommonDivisor(getNumerator(), getDenominator());
        if (gcd > 1) {
            setNumerator(getNumerator() / gcd);
            setDenominator(getDenominator() / gcd);
        }

    }

    // Числитель:

    public int getNumerator() {
        return getFirst();
    }

    public void setNumerator(int numerator) {
        setFirst(numerator);
    }

    // Знаменатель:

    public int getDenominator() {
        return getSecond();
    }

    public void setDenominator(int denominator) {
        setSecond(denominator);
    }

    /**
     * Переопределение операции вычитания.
     *
     * @param other
     * @return
     */
    public Pair subtract(Pair other) {
        return new Rational(getNumerator() * other.getSecond() - other.getFirst() * getDenominator(),
                getDenominator() * other.getSecond());
    }

    /**
     * Операция сложения простых дробей.
     *
     * @param other
     * @return
     */
    public Rational add(Rational other) {
        return new Rational(getNumerator() * other.getDenominator() + other.getNumerator() * getDenominator(),
                getDenominator() * other.getDenominator());
    }

    /**
     * Операция умножения простых дробей.
     *
     * @param other
     * @return
     */
    public Rational multiply(Rational other) {
        return new Rational(getNumerator() * other.getNumerator(),
                getDenominator() * other.getDenominator());
    }

    public String toString() {
        return String.format("%d/%d", getNumerator(), getDenominator());
    }

    /**
     * Наибольший общий делитель.
     *
     * @param a  число a.
     * @param b  число b.
     * @return   НОД.
     */
    public static int greatestCommonDivisor(int a, int b){
        return b == 0 ? a : greatestCommonDivisor(b,a % b);
    }

}
