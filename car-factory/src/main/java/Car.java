/**
 * автомобиль
 */
public abstract class Car extends Cars {
    /**
     *
     * @param description -переменная содержащая описание автомобиля.
     * @param priv        -переменная содержащая тип привода автомобиля(1-стандартный,2-заднеприводный,3-полноприводный).
     */
    Car(String description, int priv) {
        this.description = description;
        this.priv = priv;
    }

    public double cost() {
        switch (this.priv) {  // стоимость автомобиля зависит от типа привода:
            case 3:  // 3)полноприводный (стоимость-4300$)
                return 4300;
            case 2:  // 2)Заднеприводный (стоимость-2100$)
                return 2100;
            case 1:  // 1) Переднеприводный(стандартный для всех автомобилей, стоимость-1000$)
            default:
                return 1000;
        }
    }

    public String getDescription() {
        switch (this.priv) {  // стоимость автомобиля зависит от типа привода:
            case 3:
                return "полноприводный " + this.description;
            case 2:
                return "Заднеприводный " + this.description;
            case 1:
            default:
                return "Переднеприводный " + this.description;
        }
    }
}
