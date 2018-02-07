public class LowPriceCars extends Car {
    LowPriceCars(int priv) {
        super("Обычный легковой автомобиль", priv);
    }

    public double cost() {
        return super.cost() + 6000;  // 6000$
    }
}
