import java.io.*;

public class Lab1 {
    private static final int EXIT_SUCCESS = 0;
    private static final int EXIT_FAILURE = -1;

    private static void error(Point3d point1, Point3d point2) {
        System.out.println(String.format("В паре %s и %s точки \"одинаковы\"!", point1, point2));
        System.exit(EXIT_FAILURE);
    }

    public static void main(String[] args) throws IOException {
        Point3d[] triangle = new Point3d[3];  // объекты Point3d.

        // Объекты необходимые для организации ввода данных:
        Reader reader = new InputStreamReader(System.in);
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(reader));

        // Пользовательский ввод трех троек значений, каждое из которых задает координаты одной точки в трехмерном пространстве:
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new Point3d();

            System.out.print(String.format("Задайте координаты %d-й точки в трехмерном пространстве ⟶ ", i + 1));

            in.nextToken();  // ввод координаты X точки.
            triangle[i].setX(in.nval);

            in.nextToken();  // ввод координаты Y точки.
            triangle[i].setY(in.nval);

            in.nextToken();  // ввод координаты Z точки.
            triangle[i].setZ(in.nval);
        }

        // Проверка на равенство всех трех точек Point3d's.
        // Если в какой-либо паре точки "одинаковы", сообщаем об этом пользователю и не вычисляем площадь.

        if (triangle[0].equals(triangle[1])) {
            error(triangle[0], triangle[1]);

        } else if (triangle[0].equals(triangle[2])) {
            error(triangle[0], triangle[2]);

        } else if (triangle[1].equals(triangle[2])) {
            error(triangle[1], triangle[2]);

        } else {
            System.out.println(String.format("Площадь треугольника = %.2f", Point3d.computeArea(triangle[0], triangle[1], triangle[2])));
            System.exit(EXIT_SUCCESS);
        }
    }
}
