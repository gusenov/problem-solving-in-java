public class PickUp extends Car {
    PickUp(int priv) {
        super("пикап", priv);
    }

    public double cost() {
        return super.cost() + 10000;  // 10000$
    }
}
