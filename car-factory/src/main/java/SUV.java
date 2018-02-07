public class SUV extends Car {
    SUV(int priv) {
        super("внедорожник", priv);
    }

    public double cost() {
        return super.cost() + 15000;  // 15000$
    }
}
