import java.util.ArrayList;

public class Demo {
    private static final ArrayList<String> carTypes = new ArrayList<String>() {{
        add("PickUp");
        add("SUV");
        add("LowPriceCars");
    }};

    public static void main(String[] args) {
        CarFactory Siberia = new CarFactory();
        Car car;
        for (String carType : carTypes) {
            for (int priv = 1; priv <= 3; priv++) {
                if (priv == 1) {
                    car = Siberia.getCar(carType);
                } else {
                    car = Siberia.getCar(carType, priv);
                }
                System.out.println(car.getDescription() + " стоит " + car.cost() + "$");
            }
        }
    }
}
