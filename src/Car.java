public class Car {
    private String brand, model;
    private float engineVolume;

    public Car(String brand, String model, float engineVolume) {
        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = "Марка не указана";
        }
        if (model != null) {
            this.model = model;
        } else {
            this.model = "Модель не указана";
        }
        if (engineVolume > 0.0f) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = -1.0f;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    void moveStart() {
        System.out.println("начать движение");
    }

    void moveEnd() {
        System.out.println("закончить движение");
    }
}