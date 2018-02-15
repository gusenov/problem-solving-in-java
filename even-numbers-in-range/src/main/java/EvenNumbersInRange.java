import java.io.*;

public class EvenNumbersInRange {
    private int a;

    private int b;

    public EvenNumbersInRange(int a, int b) {
        if (a > b) {
            throw new IllegalArgumentException("a должно быть меньше b!");
        }

        this.a = a;
        this.b = b;
    }

    /**
     * Вывод всех чётных чисел от а до b (включая числа a и b).
     * @param out  объект вывода.
     */
    public void output(PrintWriter out) {
        if (out == null) {  // если вывод не указан:
            out = new PrintWriter(new OutputStreamWriter(System.out));  // то будем выводить в стандартный поток вывода.
        }

        boolean firstOutput = true;  // нужно ли выводить пробел?

        for (int i = this.a; i <= this.b; i++) {
            if (i % 2 == 0) {  // если число делится на 2:
                if (!firstOutput) out.print(' ');  // вывести пробел, если нужно.
                out.print(i);  // вывести число.
                if (firstOutput) firstOutput = false;  // после первого числа, всегда нужно дальше ставить пробелы.
            }
        }

        out.flush();  // вывести всё в стандартный поток вывода.
    }

    /**
     * Тестовый метод.
     */
    public static void test() {
        int a, b;

        a = -5; b = 3;
        System.out.println(String.format("Тест № 1, a=%d b=%d", a, b));
        new EvenNumbersInRange(a, b).output(null);  // -4 -2 0 2
        System.out.println();

        a = 3; b = -5;
        System.out.println(String.format("Тест № 2, a=%d b=%d", a, b));
        new EvenNumbersInRange(a, b);  // Exception in thread "main" java.lang.IllegalArgumentException: a должно быть меньше b!
    }

    public static void run() throws IOException {
        int a, b;

        // Объекты необходимые для организации ввода данных:
        Reader reader = new InputStreamReader(System.in);
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(reader));

        // Объекты необходимые для организации вывода данных:
        Writer writer = new OutputStreamWriter(System.out);
        PrintWriter out = new PrintWriter(writer);

        // Ввод целого числа a:
        in.nextToken();
        a = (int)in.nval;

        // Ввод целого числа b:
        in.nextToken();
        b = (int)in.nval;

        new EvenNumbersInRange(a, b).output(out);  // вывести все чётные числа.
    }

    public static void main(String[] args) throws IOException {
//        EvenNumbersInRange.test();  // запуск тестов.

        run();  // запуск программы.
    }
}
