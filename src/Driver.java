public class Driver {
    private String name;
    private boolean driverLicense;
    private int drivingExperience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "имя водителя не указано";
        }
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        if (drivingExperience > 0) {
            this.drivingExperience = drivingExperience;
        } else {
            this.drivingExperience = -1;
        }
    }

    void moveStart() {
        System.out.println("начать движение");
    }

    void moveEnd() {
        System.out.println("закончить движение");
    }

    void refill() {
        System.out.println("заправить авто");
    }
}
