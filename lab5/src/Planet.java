public class Planet {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    double diameter;

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    double distanceFromSun;

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }


    public Planet(String name, double diameter, double distanceFromSun) {
        this.name = name;
        this.diameter = diameter;
        this.distanceFromSun = distanceFromSun;
    }
}
