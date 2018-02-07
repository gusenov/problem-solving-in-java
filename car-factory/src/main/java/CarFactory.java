/**
 * завод по производству автомобилей
 */
public class CarFactory {

    /**
     * @param description переменная содержащая описание автомобиля.
     * @param priv переменная содержащая тип привода автомобиля(1-стандартный,2-заднеприводный,3-полноприводный).
     * @return
     */
    public Car getCar(String description, int priv) {
        switch (description) {  // завод производит 3 типа автомобилей:
            case "PickUp":
                return new PickUp(priv);
            case "SUV":
                return new SUV(priv);
            case "LowPriceCars":
                return new LowPriceCars(priv);
            default:
                return null;
        }
    }

    public Car getCar(String description) {
        return this.getCar(description, 1);  // Переднеприводный(стандартный для всех автомобилей)
    }

}
