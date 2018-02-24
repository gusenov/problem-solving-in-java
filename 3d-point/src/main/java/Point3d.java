/**
 * Описывает точку в трехмерном евклидовом пространстве.
 */
public class Point3d {

    // Внутренние поля объекта Point3d недоступны напрямую:

    /**
     * Координата X точки.
     */
    private double xCoord;

    /**
     * Координата Y точки.
     */
    private double yCoord;

    /**
     * Координата Z точки.
     */
    private double zCoord;


    /**
     * Создание новой точки {@link Point3d} с тремя указанными значениями координат (типа double).
     * @param x  координата X точки.
     * @param y  координата Y точки.
     * @param z  координата Z точки.
     */
    public Point3d(double x, double y, double z) {
        this.xCoord = x;
        this.yCoord = y;
        this.zCoord = z;
    }

    /**
     * Создание новой точки {@link Point3d} в позиции (0.0, 0.0, 0.0) по умолчанию.
     */
    public Point3d() {
        this(0.0, 0.0, 0.0);
    }

    /**
     * Возвращает координату X точки.
     * @return  координата X точки.
     */
    public double getX() {
        return xCoord;
    }

    /**
     * Изменяет координату X точки.
     * @param val  новая координата X точки.
     */
    public void setX(double val) {
        this.xCoord = val;
    }

    /**
     * Возвращает координату Y точки.
     * @return  координата Y точки.
     */
    public double getY() {
        return yCoord;
    }

    /**
     * Изменяет координату Y точки.
     * @param val  новая координата Y точки.
     */
    public void setY(double val) {
        this.yCoord = val;
    }

    /**
     * Возвращает координату Z точки.
     * @return  координата Z точки.
     */
    public double getZ() {
        return zCoord;
    }

    /**
     * Изменяет координату Z точки.
     * @param val  новая координата Z точки.
     */
    public void setZ(double val) {
        this.zCoord = val;
    }

    /**
     * Сравнение двух точек {@link Point3d}s на равенство значений координат.
     * @param otherPoint  другой объект типа {@link Point3d}.
     * @return  результат проверки на равенство.
     */
    @Override
    public boolean equals(Object otherPoint) {
        if (this == otherPoint)
            return true;

        if (!(otherPoint instanceof Point3d))
            return false;

        Point3d myOtherPoint = (Point3d)otherPoint;
        return
                Double.doubleToLongBits(this.getX()) == Double.doubleToLongBits(myOtherPoint.getX()) &&
                Double.doubleToLongBits(this.getY()) == Double.doubleToLongBits(myOtherPoint.getY()) &&
                Double.doubleToLongBits(this.getZ()) == Double.doubleToLongBits(myOtherPoint.getZ());
    }

    /**
     * Вычисляет расстояние по прямой до объекта {@code otherPoint}.
     * @param otherPoint  другой объект типа {@link Point3d}.
     * @return  возвращает расстояние.
     */
    public double distanceTo(Point3d otherPoint) {
        return (Math.sqrt(
            Math.pow(this.getX() - otherPoint.getX(), 2) +
            Math.pow(this.getY() - otherPoint.getY(), 2) +
            Math.pow(this.getZ() - otherPoint.getZ(), 2)
        ));
    }

    /**
     * Статический метод, который получает три точки {@link Point3d}'s и вычисляет площадь треугольника ограниченного этими точками.
     * @param a  точка A.
     * @param b  точка B.
     * @param c  точка C.
     * @return  площадь в значении типа double.
     * @see <a href="https://ru.wikipedia.org/wiki/Треугольник">Треугольник — Википедия</a>
     * @see <a href="https://ru.wikipedia.org/wiki/Формула_Герона">Формула Герона — Википедия</a>
     */
    public static double computeArea(Point3d a, Point3d b, Point3d c) {
        double bc = b.distanceTo(c);  // сторона a.
        double ac =  a.distanceTo(c);  // сторона b.
        double ab = a.distanceTo(b);  // сторона c.
        double p = (bc + ac + ab) / 2;  // полупериметр треугольника.
        return Math.sqrt(p * (p - bc) * (p - ac) * (p - ab));  // площадь треугольника.
    }

    @Override
    public String toString() {
        return String.format("(%.2f; %.2f; %.2f)", this.getX(), this.getY(), this.getZ());
    }
}
