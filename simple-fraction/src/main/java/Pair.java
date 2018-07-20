
/**
 * Пара чисел.
 */
public class Pair {

    /** Первое число. */
    private int first;

    /** Второе число. */
    private int second;

    /**
     * Конструктор.
     *
     * @param first   первое число.
     * @param second  второе число.
     */
    public Pair(int first, int second) {
        setFirst(first);
        setSecond(second);
    }

    // Методы изменения полей:

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    /**
     * Метод проверки на равенство.
     *
     * @param other
     * @return
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (getClass() != other.getClass()) return false;
        Pair pair = (Pair)other;
        return getFirst() == pair.getFirst()
                && getSecond() == pair.getSecond();
    }

    /**
     * Операция перемножение полей.
     *
     * @return  произведение.
     */
    public int multiply() {
        return getFirst() * getSecond();
    }

    /**
     * Операция вычитания пар по формуле:
     * (a, b) - (c, d) = (a - b, c - d).
     *
     * @param other  вычитаемое.
     * @return       разность.
     */
    public Pair subtract(Pair other) {
        return new Pair(getFirst() - other.getFirst(),
                getSecond() - other.getSecond());
    }

    public String toString() {
        return String.format("(%d, %d)", getFirst(), getSecond());
    }

}
